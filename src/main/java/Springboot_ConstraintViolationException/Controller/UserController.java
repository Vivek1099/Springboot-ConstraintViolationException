package Springboot_ConstraintViolationException.Controller;

import Springboot_ConstraintViolationException.Entity.UserEntity;
import Springboot_ConstraintViolationException.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/byid/{userid}")
    public Optional<UserEntity> ById(@PathVariable int userid)
    {
        return userRepository.findById(userid);
    }

    @DeleteMapping("/delete/{userid}")
    public String delete(@PathVariable int userid)
    {
        userRepository.deleteById(userid);
        return "User data deleted";
    }

    @PutMapping("/update/{userid}")
    public UserEntity update(@RequestBody UserEntity userEntity, @PathVariable int userid)
    {
        UserEntity u = userRepository.findById(userid).get();
        u.setFname(userEntity.getFname());
        u.setLname(userEntity.getLname());
        u.setPhoneno(userEntity.getPhoneno());
        return userRepository.save(u);
    }

    @GetMapping("/byname/{fname}/{lname}")
    public List<UserEntity> Byname(@PathVariable String fname, @PathVariable String lname)
    {
        return (List<UserEntity>) userRepository.getByfnameandlname(fname, lname);
    }
}
