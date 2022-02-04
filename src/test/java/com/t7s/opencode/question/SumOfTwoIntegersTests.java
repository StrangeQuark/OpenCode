package com.t7s.opencode.question;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SumOfTwoIntegersTests {
    @Test
    void scenario(int x, int y, int correctAnswer) {
        assertThat(x + y).isEqualTo(correctAnswer);
    }
}