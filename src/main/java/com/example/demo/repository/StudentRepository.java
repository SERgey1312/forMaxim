package com.example.demo.repository;

import com.example.demo.model.Student;
import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
    Student findByName(String name);
}
