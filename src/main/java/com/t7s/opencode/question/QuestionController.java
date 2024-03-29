package com.t7s.opencode.question;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping(path = "api/v1/question")
public class QuestionController {
    private final QuestionService questionService;

    @Autowired
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping(path = "/user-attempts/{userId}")
    public List<Question> getAttemptedQuestions(@PathVariable("userId") Long userId) {
        return questionService.getAttemptedQuestions(userId);
    }

    @GetMapping(path = "/user-completions/{userId}")
    public List<Question> getCompletedQuestions(@PathVariable("userId") Long userId) {
        return questionService.getCompletedQuestions(userId);
    }

    @GetMapping(path = "{questionName}")
    public Optional<Question> getQuestion(@PathVariable("questionName") String questionName) {
        return questionService.getQuestion(questionName);
    }
}
