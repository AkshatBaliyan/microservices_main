package com.question.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.question.Repositeries.QuestionRepository;
import com.question.Service.QuestionService;
import com.question.entities.Question;
@Service
public class QuestionServiceImpl implements  QuestionService {

    @Autowired
    QuestionRepository  questionRepository;



    @Override
    public Question create(Question  question) {

       return questionRepository.save(question);
    }

    @Override
    public List<Question> get() {
        // TODO Auto-generated method stub
        return questionRepository.findAll();
        
    }

    @Override
    public Question getOne(Long id) {
        // TODO Auto-generated method stub
        return questionRepository.findById(id).orElse(null);
    
    }

    @Override
    public List<Question> getQuestionsOfQuiz(Long quizId) {
      return questionRepository.findByQuizId(quizId);
    }

    
}
