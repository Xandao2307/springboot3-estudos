package com.aulaSpring.cursoJava.service;

import com.aulaSpring.cursoJava.entities.Category;
import com.aulaSpring.cursoJava.entities.User;
import com.aulaSpring.cursoJava.repositories.CategoryRepository;
import com.aulaSpring.cursoJava.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }

}
