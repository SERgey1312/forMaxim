package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.model.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TeacherService {
    List<Teacher> getAllTeachers();
    void saveTeacher(Teacher teacher);
    void deleteTeacherById(long id);
    Teacher getTeacherById(long id);
}
