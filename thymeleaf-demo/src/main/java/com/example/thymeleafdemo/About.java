package com.example.thymeleafdemo;

public class About {
    private String name;
    private String email;
    private String githubUrl;

    public About(String name, String email, String githubUrl) {
        this.name = name;
        this.email = email;
        this.githubUrl = githubUrl;
    }

    @Override
    public String toString() {
        return "About{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", githubUrl='" + githubUrl + '\'' +
                '}';
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
