package com.example.demo.service;

import com.example.demo.model.Lesson;
import com.example.demo.model.Student;
import com.example.demo.repository.LessonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonInterfaceImpl implements LessonService {
    @Autowired
    LessonsRepository lessonsRepository;

    @Override
    public List<Lesson> getAllLess() {
        return lessonsRepository.findAll();
    }

    @Override
    public void saveLess(Lesson lesson) {
        lessonsRepository.save(lesson);
    }

    @Override
    public void deleteLessById(long id) {
        lessonsRepository.deleteById(id);
    }

    @Override
    public Lesson getLessById(long id) {
        return lessonsRepository.getOne(id);
    }
}
