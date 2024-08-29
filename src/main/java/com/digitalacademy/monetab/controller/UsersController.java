package com.digitalacademy.monetab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users1")
public class Users1Controller {

    @GetMapping
    public String showUser1Page(){
        return "users1/list";
    }

    @GetMapping("/add")
    public String showAddUser1Page(){
        return "users1/forms";
    }

    @GetMapping("/update")
    public String showUpdateUser1Page(){
        return "users1/forms";
    }
}
