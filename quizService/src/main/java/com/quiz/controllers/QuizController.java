package com.quiz.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.Entities.Quiz;
import com.quiz.Services.QuizService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping( "/quiz")
public class QuizController {
    
    @Autowired
    private QuizService  quizService;


    //create
    @PostMapping
    public Quiz create(@RequestBody Quiz quiz){
        return quizService.add(quiz);
    }

    //getall
    @GetMapping()
    public List<Quiz> get(){
        return quizService.get();
    }

    //by id 
    @GetMapping("{id}")
    public Quiz getOne(@PathVariable Long id){
        return quizService.get(id);
    }
    
    


    

}
