package com.aulaSpring.cursoJava.repositories;

import com.aulaSpring.cursoJava.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
