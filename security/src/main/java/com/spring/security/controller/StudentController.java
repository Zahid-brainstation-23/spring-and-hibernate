package com.spring.security.controller;


import com.spring.security.entity.Student;
import com.spring.security.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {

        this.studentService = studentService;
    }

    @GetMapping({"/{id}"})
    public ResponseEntity<Student> getOne(@PathVariable  UUID id){
        return studentService.getOne(id);
    }

    @PostMapping
    public  ResponseEntity<Student> createOne(@RequestBody Student student){
        return studentService.createOne(student);
    }

    @GetMapping()
    public ResponseEntity<List<Student>> getAll(){
        return studentService.getAll();
    }
}
