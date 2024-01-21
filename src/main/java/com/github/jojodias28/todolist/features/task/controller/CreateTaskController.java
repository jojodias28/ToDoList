package com.github.jojodias28.todolist.features.task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.jojodias28.todolist.features.task.service.CreateTaskService;

@RestController
@RequestMapping("/task")
public class CreateTaskController {
    @Autowired
    CreateTaskService createTaskService;
    @PostMapping("/create")
    public ResponseEntity<CreateTask> create(@RequestBody CreateTask createTask){
        CreateTask response = this.createTaskService.create(createTask);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
