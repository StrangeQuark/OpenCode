package com.t7s.opencode.question;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface QuestionRepository extends JpaRepository<Question, Long> {

    @Query("SELECT q FROM Question q WHERE q.name = ?1")
    Optional<Question> findQuestionByName(String name);

    @Query(value = "SELECT * FROM question WHERE id IN (SELECT questions_attempted FROM users_questions_attempted WHERE users_questions_attempted.users_id = :userId)", nativeQuery = true)
    List<Question> findUserAttempts(Long userId);

    @Query(value = "SELECT * FROM question WHERE id IN (SELECT questions_completed FROM users_questions_completed WHERE users_questions_completed.users_id = :userId)", nativeQuery = true)
    List<Question> findUserCompletions(Long userId);
}
