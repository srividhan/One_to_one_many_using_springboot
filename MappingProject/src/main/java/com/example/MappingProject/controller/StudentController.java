package com.example.MappingProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MappingProject.model.Student;
import com.example.MappingProject.repository.StudentRepository;

@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
    
    @GetMapping("/show")
    public List<Student> getAllDetails(){
        return (List<Student>) studentRepository.findAll();
    }

    @PostMapping("/create")
    public ResponseEntity<String> createDetails(@RequestBody List<Student> studentData){
        studentRepository.saveAll(studentData);
        // .save(new Student(student.getName(),student.getAge(),student.getAddress()));
        return ResponseEntity.ok("Data saved");
    }

    @DeleteMapping("/delete")
    public ResponseEntity<HttpStatus> deleteAllDetails(){
        studentRepository.deleteAll();
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
