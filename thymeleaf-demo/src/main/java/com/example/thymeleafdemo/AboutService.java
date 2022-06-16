package com.example.thymeleafdemo;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class AboutService {

    public List<About> abouts = new ArrayList<>(Arrays.asList(
            new About(1,"Dang", "dang.vue0@gmail.com", "https://github.com/dangvue0/SeleniumJava2022"),
            new About(2,"Jon", "jon@gmail.com", "https://github.com/dangvue0/SeleniumJava2022"),
            new About(3,"Cain", "cain@gmail.com", "https://github.com/dangvue0/SeleniumJava2022")
    ));

    public List<About> getAllAbouts() {
        return abouts;
    }

    public void addAbout(About about) {
        abouts.add(about);
    }

    public About findByName(String name) {
        return abouts.stream().filter(about -> about.getName() == name).findFirst().get();
    }

    public About finById(int id) {
        return abouts.stream().filter(about -> about.getId() == id).findFirst().get();
    }
}
