package com.spring.security.controller;


import com.spring.security.entity.Student;
import com.spring.security.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/student")
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping({"{id}"})
    public ResponseEntity<Student> getOne(@PathVariable  UUID id){
        return studentService.getOne(id);
    }

    @PostMapping
    public  ResponseEntity<Student> createOne(@RequestBody Student student){
        return studentService.createOne(student);
    }
}
