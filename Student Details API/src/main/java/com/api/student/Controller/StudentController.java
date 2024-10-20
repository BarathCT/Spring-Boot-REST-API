package com.api.student.Controller;

import com.api.student.Model.StudentModel;
import com.api.student.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<StudentModel> getAllStudent(){
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<StudentModel> getStudentById(@PathVariable Long id){
        StudentModel student = studentService.getStudentById(id);
        return ResponseEntity.ok(student);
    }

    @PostMapping("/students")
    public ResponseEntity<StudentModel> createStudent(@RequestBody StudentModel studentDetails){
        StudentModel createStudent = studentService.addStudent(studentDetails);
        return ResponseEntity.status(HttpStatus.CREATED).body(createStudent);
    }

    @PutMapping("/students/{id}")
    public ResponseEntity<StudentModel> updateStudent(@PathVariable Long id, @RequestBody StudentModel studentDetails){
        StudentModel updatedStudent = studentService.updateStudent(id, studentDetails);
        return updatedStudent != null ? ResponseEntity.ok(updatedStudent) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/students/{id}")
    public ResponseEntity<Void> deleteStudentById(@PathVariable Long id){
        studentService.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/students                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                /delete")
    public ResponseEntity<Void> deleteAllStudent(){
        studentService.deleteAllStudent();
        return ResponseEntity.noContent().build();
    }
}
