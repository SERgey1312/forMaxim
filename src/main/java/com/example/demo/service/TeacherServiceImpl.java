package com.example.demo.service;

import com.example.demo.model.Teacher;
import com.example.demo.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements  TeacherService {
    @Autowired
    TeacherRepository teacherRepository;

    @Override
    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    @Override
    public void saveTeacher(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    @Override
    public void deleteTeacherById(long id) {
        teacherRepository.deleteById(id);
    }

    @Override
    public Teacher getTeacherById(long id) {
        return teacherRepository.getOne(id);
    }
}
