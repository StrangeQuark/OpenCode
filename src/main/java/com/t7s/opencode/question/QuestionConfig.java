package com.t7s.opencode.question;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class QuestionConfig {
    @Bean
    CommandLineRunner commandLineRunner(QuestionRepository repository) {
        return args -> {
            Question testQuestion = new Question("TestQuestion", "    <p>\n" + "        <strong>\n" + "            Example 1:\n" + "        </strong>\n" + "    </p>\n" + "    <pre>\n" + "        <strong>\n" + "            Input:\n" + "        </strong>\n" + "        num1 = 3, num2 = 5\n" + "    </pre>\n" + "    <pre>\n" + "        <strong>\n" + "            Output: \n" + "        </strong>\n" + "        8\n" + "    </pre>\n", "public class TestClass {\n" + "  public int SumOfTwoInts(int i, int j) {\n" + "    \n" + "  }\n" + "}", "public class CorrectClass {\n" + "  public int SumOfTwoInts(int i, int j) {\n" + "   \treturn i + j; \n" + "  }\n" + "}", "Test", "public class Tests {\n" + "\tprivate static boolean sumsTest(int i, int j, TestClass tc, CorrectClass cc) {\n" + "   \tint testResponse = tc.SumOfTwoInts(i, j);\n" + "    int correctResponse = cc.SumOfTwoInts(i, j);\n" + "    \n" + "    if(testResponse == correctResponse)\n" + "      return true;\n" + "    return false;\n" + "  }\n" + "\n" + "\tpublic static void main(String[] args) {\n" + "        TestClass tc = new TestClass();\n" + "        CorrectClass cc = new CorrectClass();\n" + "\t    System.out.println(sumsTest(1,1, tc, cc)); \n" + "  }\n" + "}");
            Question testQuestion2 = new Question("TestQuestion2", "    <p>\n" + "        <strong>\n" + "            Example 1:\n" + "        </strong>\n" + "    </p>\n" + "    <pre>\n" + "        <strong>\n" + "            Input:\n" + "        </strong>\n" + "        num1 = 3, num2 = 5\n" + "    </pre>\n" + "    <pre>\n" + "        <strong>\n" + "            Output: \n" + "        </strong>\n" + "        8\n" + "    </pre>\n", "Test", "Test", "Test", "");
            Question testQuestion3 = new Question("TestQuestion3", "    <p>\n" + "        <strong>\n" + "            Example 1:\n" + "        </strong>\n" + "    </p>\n" + "    <pre>\n" + "        <strong>\n" + "            Input:\n" + "        </strong>\n" + "        num1 = 3, num2 = 5\n" + "    </pre>\n" + "    <pre>\n" + "        <strong>\n" + "            Output: \n" + "        </strong>\n" + "        8\n" + "    </pre>\n", "Test", "Test", "Test", "");

            repository.saveAll(List.of(testQuestion, testQuestion2, testQuestion3));
        };
    }
}
