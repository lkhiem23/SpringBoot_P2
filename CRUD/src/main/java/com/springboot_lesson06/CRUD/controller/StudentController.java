package com.springboot_lesson06.CRUD.controller;

import com.springboot_lesson06.CRUD.dto.StudentDTO;
import com.springboot_lesson06.CRUD.entity.Student;
import com.springboot_lesson06.CRUD.service.StudentService;
import org.hibernate.boot.model.naming.IllegalIdentifierException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
// @RestController ---- Dùng API
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

  /*
  // Get All ------ API
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.findAll();
    }
  */

    @GetMapping
    public String getAllStudents(Model model) {
        List<Student> students = studentService.findAll();
        model.addAttribute("students",students);
        return "students/list";
    }
    //Get: Create
    @GetMapping("/add-new")
    public String addNewStudent(Model model) {
        model.addAttribute("student",new StudentDTO());
        return "students/create";
    }


    //Create Post
    @PostMapping("/add-new")
    public String saveNewStudent(@ModelAttribute("student") StudentDTO student) {
        studentService.save(student);
        return "redirect:/students";
    }

    //View
    @GetMapping("/view/{id}")
    public String viewStudent(@PathVariable(value="id") Long id, Model model) {
        StudentDTO studentDTO = studentService.findById(id).orElseThrow(()-> new
                IllegalIdentifierException("Invalid student id"+id));
        model.addAttribute("student",studentDTO);
        return "students/view";
    }

    //Edit
    @GetMapping("/edit/{id}")
    public String editStudent(@PathVariable(value="id") Long id, Model model) {
        StudentDTO studentDTO = studentService.findById(id).orElseThrow(()-> new
                IllegalIdentifierException("Invalid student id"+id));
        model.addAttribute("student",studentDTO);
        return "students/edit";
    }

    // Edit Post
    @PostMapping("/update/{id}")
    public String updateStudent(@PathVariable(value="id") Long id, @ModelAttribute("student") StudentDTO studentDTO) {
        studentService.updateStudentById(studentDTO, id);
        return "redirect:/students";
    }

    //Delete
    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable(value="id") Long id, Model model) {
        studentService.delete(id);
        return "redirect:/students";
    }
}
