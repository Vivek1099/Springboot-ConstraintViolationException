package Springboot_ConstraintViolationException.Controller;

import Springboot_ConstraintViolationException.Entity.UserEntity;
import Springboot_ConstraintViolationException.Repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Validated
public class UserController
{
    @Autowired
    UserRepository userRepository;

    @GetMapping("/test")
    public String testcase()
    {
        return "Test for constraint voilation";
    }

    @PostMapping("/save")
    public String savedata(@RequestBody UserEntity userEntity)
    {
        userRepository.save(userEntity);
        return "Data Saved";
    }

    @GetMapping("/show")
    public List<UserEntity> showdata()
    {
        return userRepository.findAll();
    }
}
