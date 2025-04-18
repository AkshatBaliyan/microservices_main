package com.question.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.question.Service.QuestionService;
import com.question.entities.Question;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/question")
public class Questioncontroller {
    @Autowired
    private QuestionService questionService;
    
    @PostMapping
    public Question addQuestion(@RequestBody Question  question) {

     return questionService.create(question);
    }

    @GetMapping
    public List<Question> getAllQuestions() {
        return questionService.get();
    }

    @GetMapping("{questionId}")
    public Question getone(@PathVariable Long questionId){
        return questionService.getOne(questionId);

        
    }


    @GetMapping("quiz/{quizId}")
    List<Question>getQuestionsOfQuiz(@PathVariable Long quizId){
        return questionService.getQuestionsOfQuiz(quizId);
    }
    


}
