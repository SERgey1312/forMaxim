package com.example.demo.repository;

import com.example.demo.model.Lesson;
import com.example.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonsRepository  extends JpaRepository<Lesson,Long> {
    Lesson findByName(String name);
}