package com.springboot_lesson06.CRUD.service;

import com.springboot_lesson06.CRUD.dto.StudentDTO;
import com.springboot_lesson06.CRUD.entity.Student;
import com.springboot_lesson06.CRUD.responsitory.StudentResponsitory;
import lombok.NoArgsConstructor;
import org.hibernate.boot.model.naming.IllegalIdentifierException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@NoArgsConstructor
public class StudentService {
    private StudentResponsitory studentResponsitory;

    @Autowired
    public StudentService(StudentResponsitory studentResponsive) {
        this.studentResponsitory = studentResponsive;
    }

    public List<Student> findAll() {
        return studentResponsitory.findAll();
    }

    public Optional<StudentDTO> findById(Long id) {
        Student student = studentResponsitory.findById(id).orElse(null);
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(student.getId());
        studentDTO.setName(student.getName());
        studentDTO.setEmail(student.getEmail());
        studentDTO.setAge(student.getAge());

        return Optional.of(studentDTO);
    }
    
// Create -----------------------------------------
    
    public boolean save(StudentDTO studentDTO ) {
        Student student = new Student();
        student.setName(studentDTO.getName());
        student.setEmail(studentDTO.getEmail());
        student.setAge(studentDTO.getAge());
        try {
            studentResponsitory.save(student);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

// Update -----------------------------------------
    public Student updateStudentById(StudentDTO updateStudent, Long id) {
        return studentResponsitory.findById(id).map(student -> {
            student.setName(updateStudent.getName());
            student.setEmail(updateStudent.getEmail());
            student.setAge(updateStudent.getAge());
            return studentResponsitory.save(student);
        }).orElseThrow(()->new IllegalIdentifierException("Invalid student ID: " + id));
    }

// Delete -----------------------------------------
    public void delete(Long id){
        studentResponsitory.deleteById(id);
    }
}
