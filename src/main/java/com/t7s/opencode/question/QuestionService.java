package com.t7s.opencode.question;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {
    public final QuestionRepository questionRepository;

    @Autowired
    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    public Optional<Question> getQuestion(Long questionId) {
        return questionRepository.findById(questionId);
    }

    public Optional<Question> getQuestion(String questionName) {
        return questionRepository.findQuestionByName(questionName);
    }

    public List<Question> getAttemptedQuestions(Long userId) {
        return questionRepository.findUserAttempts(userId);
    }

    public List<Question> getCompletedQuestions(Long userId) {
        return questionRepository.findUserCompletions(userId);
    }
}
