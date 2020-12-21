package com.example.demo.StudentController;

import org.springframework.web.bind.annotation.*;

@RestController
public class Student {

    @GetMapping("/Student")
    public String StudentGet() {
        return "return from getstudent";
    }

    @PostMapping("/Student")
    public String StudentPost() {
        return "return from poststudent";
    }

    @PutMapping("/Student")
    public String StudentPut() {
        return "return from putstudent";
    }

    @DeleteMapping("/Student")
    public String StudentDelete() {
        return "return from deletestudent";
    }
}
