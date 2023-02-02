package com.Masssss.StudentManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {


    @Autowired
    StudentService studentService;

    //get information
    @GetMapping("/get_Student")
    public Student getStudent(@RequestParam ("p") int admnNo){
        return studentService.getStudent(admnNo);
    }


    //Adding the InforMation


    @PostMapping("/add_Student")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @DeleteMapping("/delete_Student/{id}")
    public String deleteStudent(@PathVariable ("id") int id){
        return studentService.deleteStudent(id);
    }

    @PutMapping("/update_Student")
    public String updateStudent(@RequestParam ("id") int id,@RequestParam ("age") int age){
        return studentService.updateStudent(id,age);
    }
}
