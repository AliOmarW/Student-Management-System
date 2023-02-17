package com.project.studentmanagementsystem.controller;

import com.project.studentmanagementsystem.model.Student;
import com.project.studentmanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public String listAllStudentsView(Model model) {
        model.addAttribute("students", studentService.getAllStudent());
        return "students";
    }

    @GetMapping("/students/create_student")
    public String addNewStudentView(Model model) {
        Student newStudent = new Student();
        model.addAttribute("newStudent", newStudent);
        return "create_student";
    }

    @PostMapping("/students")
    public String addStudent(@ModelAttribute("newStudent") Student newStudent) {
        studentService.addStudent(newStudent);
        return "redirect:/students";
    }


    @GetMapping("students/edit/{studentId}")
    public String updateStudentView(Model model, @PathVariable Long studentId) {
        model.addAttribute("student", studentService.getStudent(studentId));
        return "update_student";
    }

    @PostMapping("/students/{studentId}")
    public String updateStudent(@ModelAttribute("student") Student updatedStudent, @PathVariable long studentId) {
        studentService.updateStudent(updatedStudent);
        return "redirect:/students";
    }


    @GetMapping("/students/delete/{studentId}")
    public String deleteStudent(@PathVariable long studentId) {
        studentService.deleteStudent(studentId);
        return "redirect:/students";
    }

}
