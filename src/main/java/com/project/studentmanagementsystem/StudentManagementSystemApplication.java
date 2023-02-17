package com.project.studentmanagementsystem;

import com.project.studentmanagementsystem.model.Student;
import com.project.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		studentRepository.save(new Student(1, "Ali", "Omar", "ali1234@gmail.com"));
		studentRepository.save(new Student(2, "moh", "Omar", "mohhh1234@gmail.com"));
		studentRepository.save(new Student(3, "Ahmad", "Omar", "ahmadof1234@gmail.com"));
	}
}
