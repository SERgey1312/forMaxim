package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.model.Teacher;
import com.example.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @GetMapping("/teachers")
    public String getStudents(Model model){
        model.addAttribute("teachers", teacherService.getAllTeachers());
        return "teacherPage";
    }

    @GetMapping("/teachers/add")
    public String getAddSt(Model model){
        Teacher teacher = new Teacher();
        model.addAttribute("teacher", teacher);
        return "teacherAdd";
    }

    @PostMapping("/teachers/add")
    public String saveStudent(@RequestParam String address,
                              @RequestParam String name,
                              @RequestParam String age,
                              @RequestParam String lesson
    ){
        Teacher teacher = new Teacher();
        teacher.setAddress(address);
        teacher.setAge(Integer.parseInt(age));
        teacher.setLesson(lesson);
        teacher.setName(name);
        teacherService.saveTeacher(teacher);
        return "redirect:/teachers";
    }
}
