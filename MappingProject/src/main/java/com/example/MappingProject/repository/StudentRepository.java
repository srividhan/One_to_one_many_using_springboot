package com.example.MappingProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MappingProject.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
    
}
