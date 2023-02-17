package com.project.studentmanagementsystem.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table (name = "Students Table")
@ToString
public class Student {
    @Id
            @GeneratedValue(strategy =  GenerationType.IDENTITY)
    long studentId;
    @Column(name = "First_Name")
    String studentFirstName;
    @Column(name = "Last_Name")
    String studentLastName;
    @Column(name = "Email")
    String studentEmail;
}
