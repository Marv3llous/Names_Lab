package com.example.task_01.controllers;

import com.example.task_01.models.Name;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting")
public class TaskController {

    @GetMapping
    public Name newResponse(){
        return new Name("Marvellous","22/02/2024");
    }

}
