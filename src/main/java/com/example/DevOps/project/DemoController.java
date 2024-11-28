package com.example.DevOps.project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    @GetMapping("/msg")
    public String getMsg() {
        System.out.println("My name  is  Ashish Baranwal and my friends call me Ashos");
        return "My name  is Ashish Baranwal and my friends call me Ash";
    }
}
