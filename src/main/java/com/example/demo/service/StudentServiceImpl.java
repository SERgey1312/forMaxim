package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.model.User;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void saveUser(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void deleteUserById(long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student getStudentById(long id) {
        return studentRepository.getOne(id);
    }
}
