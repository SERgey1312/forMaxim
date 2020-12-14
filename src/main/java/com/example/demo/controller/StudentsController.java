package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentsController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public String getStudents(Model model){
        model.addAttribute("students", studentService.getAllStudents());
        return "studentsPage";
    }

    @GetMapping("/students/delete/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String deleteStudent(@PathVariable(value = "id") long id){
        studentService.deleteUserById(id);
        return "redirect:/students";
    }

    @GetMapping("/students/{studenT}")
    public String studentEditForm(@PathVariable long studenT ,Student student, Model model){
        student = studentService.getStudentById(studenT);
        model.addAttribute("student", student);
        return "studentEdit";
    }
    @PostMapping("/students")
    public String saveUser(@RequestParam String address,
                           @RequestParam String name,
                           @RequestParam long id,
                           @RequestParam String age,
                           @RequestParam String classname
    ){
        Student student = studentService.getStudentById(id);
        student.setName(name);
        student.setAddress(address);
        student.setAge(Integer.parseInt(age));
        student.setClassname(classname);
        studentService.saveUser(student);
        return "redirect:/students";
    }

    @GetMapping("/students/add")
    public String getAddSt(Model model){
        Student student = new Student();
        model.addAttribute("student", student);
        return "studentAdd";
    }

    @PostMapping("/students/add")
    public String saveStudent(@RequestParam String address,
                           @RequestParam String name,
                           @RequestParam String age,
                           @RequestParam String classname
    ){
        Student student = new Student();
        student.setName(name);
        student.setAddress(address);
        student.setAge(Integer.parseInt(age));
        student.setClassname(classname);
        studentService.saveUser(student);
        return "redirect:/students";
    }

}
