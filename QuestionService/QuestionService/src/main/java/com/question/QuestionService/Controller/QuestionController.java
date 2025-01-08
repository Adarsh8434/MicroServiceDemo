package com.question.QuestionService.Controller;


import com.question.QuestionService.entities.Question;
import com.question.QuestionService.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    public QuestionService questionService;
    @PostMapping
    public Question add(@RequestBody Question question){
//        System.out.println(question.getQuizId());
        return questionService.create(question);
    }

    @GetMapping
    public List<Question> getAll(){
        return questionService.get();
    }
    @GetMapping("/{id}")
        public Question findOne(@PathVariable Long id){
        return questionService.getById(id);
    }
   @GetMapping("/quiz/{id}")
    public List<Question> getAllQuestion(@PathVariable Long id){
        return questionService.getQuestionOfQuiz(id);
   }

}
