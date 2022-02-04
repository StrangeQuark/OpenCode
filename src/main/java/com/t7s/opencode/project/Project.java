package com.t7s.opencode.project;

import javax.persistence.*;

@Entity
@Table
public class Project {
    @Id
    @SequenceGenerator(
            name = "project_sequence",
            sequenceName = "project_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "project_sequence"
    )
    private Long id;
    private String name;
    private ProjectType projectType;
    private String author;
    @Column(columnDefinition = "TEXT")
    private String projectHTML;

    public Project() {

    }

    public Project(String name, ProjectType projectType, String author, String projectHTML) {
        this.name = name;
        this.projectType = projectType;
        this.author = author;
        this.projectHTML = projectHTML;
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

    public ProjectType getProjectType() {
        return projectType;
    }

    public void setProjectType(ProjectType projectType) {
        this.projectType = projectType;
    }

    public String getProjectHTML() {
        return projectHTML;
    }

    public void setProjectHTML(String projectHTML) {
        this.projectHTML = projectHTML;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
