package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    List<Student> getAllStudents();
    void saveUser(Student student);
    void deleteUserById(long id);
    Student getStudentById(long id);
}
