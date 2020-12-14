package com.example.demo.service;

import com.example.demo.model.Lesson;
import com.example.demo.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LessonService {
    List<Lesson> getAllLess();
    void saveLess(Lesson lesson);
    void deleteLessById(long id);
    Lesson getLessById(long id);
}
