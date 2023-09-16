package com.example.lr4.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.lr4.entity.Student;

@Service
public interface StudentService {

    List<Student> getAllStudents();

    Student getStudent(int id);

    Student saveStudent(Student student);

    void deleteStudent(int id);

}