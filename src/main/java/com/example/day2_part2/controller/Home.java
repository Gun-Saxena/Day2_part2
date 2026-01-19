package com.example.day2_part2.controller;

import com.example.day2_part2.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Home {
    @GetMapping("/")
    public ArrayList<StudentModel> getStudent(){
        ArrayList<StudentModel> list=new ArrayList<>();
        list.add(new StudentModel(2,"xyz","xyz@gmail.com"));
        list.add(new StudentModel(3,"abc","abc@gmail.com"));
        list.add(new StudentModel(4,"pqr","pqr@gmail.com"));
        list.add(new StudentModel(5,"ijk","ijk@gmail.com"));
        list.add(new StudentModel(6,"uvw","uvw@gmail.com"));
        return list;
    }

}
