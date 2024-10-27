package Springboot_ConstraintViolationException.Handler;

import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler
{
    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<Object> handleConstraintViolationException(ConstraintViolationException exception){
        Map<String,String> errors=new HashMap<>();
        exception.getConstraintViolations().forEach(violation ->{
            String propertyPath=violation.getPropertyPath().toString();
            String errorMessage=violation.getMessage();
            errors.put(propertyPath, errorMessage);
        });
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }
}
