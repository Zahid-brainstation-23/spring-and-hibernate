package com.spring.security.controller;


import com.spring.security.entity.Student;
import com.spring.security.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/student")
@Tag(name="Student")
@Slf4j
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {

        this.studentService = studentService;
    }

    @Operation(summary="get one student")
    @GetMapping({"/{id}"})
    public ResponseEntity<Student> getOne(@PathVariable  UUID id){
        log.info("get student with id={}",id);
        return studentService.getOne(id);
    }


    @Operation(summary="create one student")
    @PostMapping
    public  ResponseEntity<Student> createOne(@RequestBody Student student){
        log.info("Creating a Student");
        return studentService.createOne(student);
    }
    @Operation(summary="get all student")
    @GetMapping()
    public ResponseEntity<List<Student>> getAll(){
        log.info("get all students");
        return studentService.getAll();
    }
}
