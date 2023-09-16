package com.example.lr4.dao;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.lr4.entity.Student;

@Repository
public interface StudentDAO {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudent(int id);

    void deleteStudent(int id);
}
