package com.api.student.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "studentDetails")
@Data
public class StudentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private int age;
    private String email;
}
