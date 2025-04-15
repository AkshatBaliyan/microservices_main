package com.quiz.Services;

import java.util.List;

import com.quiz.Entities.Quiz;

public interface QuizService {

    Quiz add(Quiz quiz);

    List<Quiz>get();

    Quiz get(Long id);
} 