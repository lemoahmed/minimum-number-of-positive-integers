package com.example.springboot.controller;

import com.example.springboot.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @Autowired
    TaskService taskService;
    @PostMapping
    public int Task(@RequestBody String number)
    {
        return taskService.taskLogic_1(number);
    }
}
