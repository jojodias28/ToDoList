package com.github.jojodias28.todolist.features.task.service;

import org.springframework.stereotype.Service;

import com.github.jojodias28.todolist.features.task.controller.CreateTask;

@Service
public class CreateTaskService implements ICreateTask {
    public CreateTask create(CreateTask createTask){
      return createTask;
    }
}
