package com.t7s.opencode.question;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class QuestionConfig {

    @Bean
    CommandLineRunner questionCommandLineRunner(QuestionRepository repository) {
        return args -> {
            Question testQuestion = new Question("TestQuestion", "Easy", "StrangeQuark", "    <p>\n" + "        <strong>\n" + "            Example 1:\n" + "        </strong>\n" + "    </p>\n" + "    <pre>\n" + "        <strong>\n" + "            Input:\n" + "        </strong>\n" + "        num1 = 3, num2 = 5\n" + "    </pre>\n" + "    <pre>\n" + "        <strong>\n" + "            Output: \n" + "        </strong>\n" + "        8\n" + "    </pre>\n", "public class TestClass {\n" + "  public int SumOfTwoInts(int i, int j) {\n" + "    \n" + "  }\n" + "}", "public class CorrectClass {\n" + "  public int SumOfTwoInts(int i, int j) {\n" + "   \treturn i + j; \n" + "  }\n" + "}", "Test", "import java.util.Random;\n" + "\n" + "public class Tests {\n" + "\tprivate static String sumsTest(int i, int j) {\n" + "\tTestClass tc = new TestClass();\n" + "\tCorrectClass cc = new CorrectClass();\n" + "   \tint testResponse = tc.SumOfTwoInts(i, j);\n" + "\tint correctResponse = cc.SumOfTwoInts(i, j);\n" + "\tString responseString = i + \" + \" + j + \" = \" + testResponse;\n" + "    \n" + "    if(testResponse == correctResponse)\n" + "      return responseString  + \" PASSED\";\n" + "    return responseString + \" FAILED\";\n" + "  }\n" + "\n" + "\tpublic static void main(String[] args) {\n" + "\tRandom r = new Random();\n" + "   \tfor(int i = 0; i < 10; i++) {\n" + "\t\tSystem.out.println(sumsTest(r.nextInt(100), r.nextInt(100)));\n" + "\t}\n" + "\t\n" + "  }\n" + "}");
            Question testQuestion2 = new Question("TestQuestion2", "Medium", "StrangeQuark", "    <p>\n" + "        <strong>\n" + "            Example 1:\n" + "        </strong>\n" + "    </p>\n" + "    <pre>\n" + "        <strong>\n" + "            Input:\n" + "        </strong>\n" + "        num1 = 3, num2 = 5\n" + "    </pre>\n" + "    <pre>\n" + "        <strong>\n" + "            Output: \n" + "        </strong>\n" + "        8\n" + "    </pre>\n", "Test", "Test", "Test", "");
            Question testQuestion3 = new Question("TestQuestion3", "Hard", "StrangeQuark", "    <p>\n" + "        <strong>\n" + "            Example 1:\n" + "        </strong>\n" + "    </p>\n" + "    <pre>\n" + "        <strong>\n" + "            Input:\n" + "        </strong>\n" + "        num1 = 3, num2 = 5\n" + "    </pre>\n" + "    <pre>\n" + "        <strong>\n" + "            Output: \n" + "        </strong>\n" + "        8\n" + "    </pre>\n", "Test", "Test", "Test", "");
            Question testQuestion4 = new Question("TestQuestion4", "Medium", "StrangeQuark", "    <p>\n" + "        <strong>\n" + "            Example 1:\n" + "        </strong>\n" + "    </p>\n" + "    <pre>\n" + "        <strong>\n" + "            Input:\n" + "        </strong>\n" + "        num1 = 3, num2 = 5\n" + "    </pre>\n" + "    <pre>\n" + "        <strong>\n" + "            Output: \n" + "        </strong>\n" + "        8\n" + "    </pre>\n", "Test", "Test", "Test", "");
            Question testQuestion5 = new Question("TestQuestion5", "Hard", "StrangeQuark", "    <p>\n" + "        <strong>\n" + "            Example 1:\n" + "        </strong>\n" + "    </p>\n" + "    <pre>\n" + "        <strong>\n" + "            Input:\n" + "        </strong>\n" + "        num1 = 3, num2 = 5\n" + "    </pre>\n" + "    <pre>\n" + "        <strong>\n" + "            Output: \n" + "        </strong>\n" + "        8\n" + "    </pre>\n", "Test", "Test", "Test", "");

            repository.saveAll(List.of(testQuestion, testQuestion2, testQuestion3, testQuestion4, testQuestion5));
        };
    }
}
