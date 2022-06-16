package com.example.thymeleafdemo;

public class About {
    private int id;
    private String name;
    private String email;
    private String githubUrl;


    @Override
    public String toString() {
        return "About{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", githubUrl='" + githubUrl + '\'' +
                '}';
    }

    public About(int id, String name, String email, String githubUrl) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.githubUrl = githubUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGithubUrl() {
        return githubUrl;
    }

    public void setGithubUrl(String githubUrl) {
        this.githubUrl = githubUrl;
    }
}