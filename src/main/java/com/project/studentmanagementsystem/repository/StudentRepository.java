package com.project.studentmanagementsystem.repository;
import com.project.studentmanagementsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
public interface StudentRepository extends JpaRepository<Student, Long> {
}
