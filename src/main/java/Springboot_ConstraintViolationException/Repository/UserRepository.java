package Springboot_ConstraintViolationException.Repository;

import Springboot_ConstraintViolationException.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {

    @Query("from usertable u where u.fname=?1 and u.lname=?2")
    UserEntity getByfnameandlname(String fname, String lname);
}
