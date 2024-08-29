package com.digitalacademy.monetab.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/students")
public class StudentController {

    @GetMapping
    public String showStudentPage() {
        return "list";
    }

    @GetMapping("/add")
    public String showAddStudentPage() {
        return "add";
    }

    @GetMapping("/update")
    public String showUpdateStudentPage() {
        return "update";
    }
}
