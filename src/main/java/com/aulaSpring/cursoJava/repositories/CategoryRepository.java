package com.aulaSpring.cursoJava.repositories;

import com.aulaSpring.cursoJava.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

}
