package com.example.demo.service;

import com.example.demo.model.Student;

import java.util.List;

public interface StudentService {
    Student getStudent(Long id);
    List<Student> getStudents();
    Student addStudent(Student student);
    Student updateStudent(Long id, Student student);
    Student deleteStudent(Long id);
}
