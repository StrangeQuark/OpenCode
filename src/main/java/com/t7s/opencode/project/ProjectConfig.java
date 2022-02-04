package com.t7s.opencode.project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ProjectConfig {

    @Bean
    CommandLineRunner projectCommandLineRunner(ProjectRepository repository) {
        return args -> {
            Project testProject = new Project("OpenCode", ProjectType.FULL_STACK, "StrangeQuark", "<h1 id=\"opencode\">OpenCode</h1>\n" + "<p>OpenCode is an open source LeetCode clone, and a great project to learn full stack web development and have on a resume.</p>\n" + "<h2 id=\"tools\">Tools</h2>\n" + "<p>ReactJS<br/>\n" + "PostgreSQL<br/>\n" + "Spring Boot</p>\n" + "<h2 id=\"github-links\">GitHub links</h2>\n" + "<p>Front-end: <a href=\"https://youtube.com\">https://youtube.com</a><br/>\n" + "Back-end: <a href=\"https://youtube.com\">https://youtube.com</a></p>\n");

            repository.saveAll(List.of(testProject));

            for(int i = 0; i < 30; i++) {
                Project p = new Project("Project " + i, ProjectType.FULL_STACK, "Test author", "Testhtml");

                repository.save(p);
            }
        };
    }
}
