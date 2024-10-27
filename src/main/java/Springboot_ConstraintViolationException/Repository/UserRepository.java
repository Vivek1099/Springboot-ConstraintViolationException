package Springboot_ConstraintViolationException.Repository;

import Springboot_ConstraintViolationException.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {
}
