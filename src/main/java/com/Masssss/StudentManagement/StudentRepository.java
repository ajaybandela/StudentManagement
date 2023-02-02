package com.Masssss.StudentManagement;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository {

    Map<Integer,Student> db=new HashMap<>();


    public Student getStudent(int admnNo){
        return db.get(admnNo);
    }

    public String addStudent(Student student){
        int admNo = student.getAdmnNo();
        db.put(admNo,student);
        return  "Student Added Successfully";
    }

    public String deleteStudent(int id){
        if(!db.containsKey(id)){
            return "Invalid id";
        }
        db.remove(id);
        return "student removed successfully";
    }

    public String updateStudent(int id,int age){
        if(!db.containsKey(id)){
            return "id Not present in the db";
        }
        db.get(id).setAge(age);
        return "student age successfully updated";
    }
}
