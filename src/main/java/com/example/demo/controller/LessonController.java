package com.example.demo.controller;

import com.example.demo.model.Lesson;
import com.example.demo.model.Student;
import com.example.demo.service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LessonController {

    @Autowired
    LessonService lessonService;

    @GetMapping("/lessons")
    public String getLessons(Model model){
        model.addAttribute("lessons", lessonService.getAllLess());
        return "lessonsPage";
    }

    @GetMapping("/lessons/add")
    public String getAddSt(Model model){
        Lesson lesson = new Lesson();
        model.addAttribute("lesson", lesson);
        return "lessonAdd";
    }
    @PostMapping("/lessons/add")
    public String saveStudent(@RequestParam String teachersNumber,
                              @RequestParam String name

    ){
        Lesson lesson = new Lesson();
        lesson.setName(name);
        lesson.setTeachersNumber(Integer.parseInt(teachersNumber));
        lessonService.saveLess(lesson);
        return "redirect:/lessons";
    }

}
