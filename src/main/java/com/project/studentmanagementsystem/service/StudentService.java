package com.project.studentmanagementsystem.service;

import com.project.studentmanagementsystem.model.Student;
import com.project.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudent() {
        List<Student> ret = studentRepository.findAll();
        System.out.println(ret);
        return ret;
    }

    public void addStudent(Student student) {
        studentRepository.save(student);
    }
    public Student getStudent(Long id) {
        return studentRepository.findById(id).get();
    }
    public void updateStudent(Student student) {
        studentRepository.save(student);
    }
    public void deleteStudent(long studentId) {
        studentRepository.deleteById(studentId);
    }
}
