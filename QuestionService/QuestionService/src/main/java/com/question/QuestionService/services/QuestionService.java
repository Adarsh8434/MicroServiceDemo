package com.question.QuestionService.services;

import com.question.QuestionService.entities.Question;

import java.util.List;

public interface QuestionService {
    Question create(Question question);
    List<Question> get();
    Question getById(Long id);
    List<Question> getQuestionOfQuiz(Long quizId);

}
