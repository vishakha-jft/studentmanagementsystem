package com.StudentmanagementsystemApplication.controller;

import com.StudentmanagementsystemApplication.entity.student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.StudentmanagementsystemApplication.service.studentservice;

@Controller
public class studentcontroller {

    private studentservice stuservice;

    public studentcontroller(studentservice stuservice) {
        super();
        this.stuservice = stuservice;
    }

    //handler
    @GetMapping("/students")
    public String listStudents(Model model){
        model.addAttribute("students",stuservice.getAllStudents());
        System.out.println(" path is get request");
        return "students";
    }
    @GetMapping("/students/new")
    public String createStudentForm(Model model){
        student s1 = new student();
        model.addAttribute("student",s1);
        return "addstudent";
    }
    @PostMapping("/students")
    public String savestudent(@ModelAttribute("student") student s1){
        stuservice.savestudent(s1);
        return "redirect:/students";
    }

}
