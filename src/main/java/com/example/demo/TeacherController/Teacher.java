package com.example.demo.TeacherController;

import org.springframework.web.bind.annotation.*;

@RestController
public class Teacher {
    @GetMapping("/Teacher")
    public String TeacherGet() {
        return "return from getTeacher";
    }

    @PostMapping("/Teacher")
    public String TeacherPost() {
        return "return from postTeacher";
    }

    @PutMapping("/Teacher")
    public String TeacherPut() {
        return "return from putTeacher";
    }

    @DeleteMapping("/Teacher")
    public String TeacherDelete() {
        return "return from deleteTeacher";
    }
}
