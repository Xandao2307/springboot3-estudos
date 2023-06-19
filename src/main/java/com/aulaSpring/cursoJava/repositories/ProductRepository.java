package com.aulaSpring.cursoJava.repositories;

import com.aulaSpring.cursoJava.entities.Product;
import com.aulaSpring.cursoJava.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

}
