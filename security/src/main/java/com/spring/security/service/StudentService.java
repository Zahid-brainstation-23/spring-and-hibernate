package com.spring.security.service;

import com.spring.security.entity.Student;
import com.spring.security.repository.StudentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public ResponseEntity<Student> getOne(UUID id){
        return ResponseEntity.ok(studentRepository.getOne(id));
    }

    public ResponseEntity<Student> createOne(Student student){
        return new ResponseEntity<Student>(studentRepository.save(student), HttpStatus.CREATED);
    }

}
