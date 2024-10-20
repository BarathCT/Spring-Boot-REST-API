package com.api.student.Service;

import com.api.student.Model.StudentModel;
import com.api.student.Respository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<StudentModel> getAllStudents(){
        return studentRepository.findAll();
    }

    public StudentModel getStudentById(Long id){
        return studentRepository.findById(id).orElse(null);
    }

    public StudentModel addStudent(StudentModel student){
        return studentRepository.save(student);
    }

    public StudentModel updateStudent(Long id, StudentModel studentDetails){
        StudentModel student = studentRepository.findById(id).orElse(null);
        if(student != null){
            student.setName(studentDetails.getName());
            student.setAge(studentDetails.getAge());
            student.setEmail(studentDetails.getEmail());

            return studentRepository.save(student);
        }

        return null;
    }

    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }

    public void deleteAllStudent(){
        studentRepository.deleteAll();
    }
}
