package com.spring.security.service;

import com.spring.security.Constant.ExceptionMessage;
import com.spring.security.entity.Student;
import com.spring.security.repository.StudentRepository;
import org.hibernate.sql.Delete;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public ResponseEntity<Student> getOne(UUID id){
        return ResponseEntity.ok(studentRepository.findById(id).orElseThrow(()
        -> new NoSuchElementException(ExceptionMessage.STUDENT_NOT_FOUND.getMessage())));
    }

    public ResponseEntity<Page<Student>> getAll(Pageable page){
        return ResponseEntity.ok(studentRepository.findAll(page));
    }

    public ResponseEntity<Student> createOne(Student student){
        student.setId(UUID.randomUUID());
        return new ResponseEntity<Student>(studentRepository.save(student), HttpStatus.CREATED);
    }


    public ResponseEntity<Student> updateOne(Student student){
        return ResponseEntity.ok(studentRepository.save(student));
    }

    public ResponseEntity<String> deleteOne(Student student){
        studentRepository.delete(student);
        return ResponseEntity.ok("User Deleted");
    }

    public ResponseEntity<String> deleteOneById(UUID id){
        studentRepository.deleteById(id);
        return ResponseEntity.ok("User Deleted");
    }

}
