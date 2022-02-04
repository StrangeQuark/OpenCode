package com.t7s.opencode.question;

import javax.persistence.*;

@Entity
@Table
public class Question {
    @Id
    @SequenceGenerator(
            name = "question_sequence",
            sequenceName = "question_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "question_sequence"
    )
    private Long id;
    private String name;
    private String difficulty;
    private String author;
    @Column(columnDefinition = "TEXT")
    private String questionHTML;
    @Column(columnDefinition = "TEXT")
    private String editorStartingText;
    @Column(columnDefinition = "TEXT")
    private String correctAnswer;
    @Column(columnDefinition = "TEXT")
    private String explainationHTML;
    @Column(columnDefinition = "TEXT")
    private String testFileText;

    public Question() {

    }

    public Question(String name, String difficulty, String author, String questionHTML, String editorStartingText, String correctAnswer, String explainationHTML, String testFileText) {
        this.name = name;
        this.difficulty = difficulty;
        this.author = author;
        this.questionHTML = questionHTML;
        this.editorStartingText = editorStartingText;
        this.correctAnswer = correctAnswer;
        this.explainationHTML = explainationHTML;
        this.testFileText = testFileText;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuestionHTML() {
        return questionHTML;
    }

    public void setQuestionHTML(String questionHTML) {
        this.questionHTML = questionHTML;
    }

    public String getEditorStartingText() {
        return editorStartingText;
    }

    public void setEditorStartingText(String editorStartingText) {
        this.editorStartingText = editorStartingText;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getExplainationHTML() {
        return explainationHTML;
    }

    public void setExplainationHTML(String explainationHTML) {
        this.explainationHTML = explainationHTML;
    }

    public String getTestFileText() {
        return testFileText;
    }

    public void setTestFileText(String testFileText) {
        this.testFileText = testFileText;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
