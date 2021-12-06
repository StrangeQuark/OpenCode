package com.t7s.opencode.question;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface QuestionRepository extends JpaRepository<Question, Long> {

    //SELECT * FROM question WHERE name = <parameter>
    @Query("SELECT q FROM Question q WHERE q.name = ?1")
    Optional<Question> findQuestionByName(String name);
}
