package Springboot_ConstraintViolationException.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity(name = "usertable")
public class UserEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "User ID",nullable = false, unique = true)
    int userid;

    @Column(name = "First Name",nullable = false)
    @NotEmpty(message = "First Name cannot be blank")
    String fname;

    @Column(name = "Last Name",nullable = false)
    @NotEmpty(message = "Last Name cannot be blank")
    String lname;

    @Column(name = "Phone Number")
    @Pattern(regexp = "^[6-9]{1}[0-9]{9}$", message = "Enter the valid phone number")
    String phoneno;

    public @Pattern(regexp = "^[6-9]{1}[0-9]{9}$", message = "Enter the valid phone number") String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(@Pattern(regexp = "^[6-9]{1}[0-9]{9}$", message = "Enter the valid phone number") String phoneno) {
        this.phoneno = phoneno;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public @NotEmpty(message = "First Name cannot be blank") String getFname() {
        return fname;
    }

    public void setFname(@NotEmpty(message = "First Name cannot be blank") String fname) {
        this.fname = fname;
    }

    public @NotEmpty(message = "Last Name cannot be blank") String getLname() {
        return lname;
    }

    public void setLname(@NotEmpty(message = "Last Name cannot be blank") String lname) {
        this.lname = lname;
    }
}
