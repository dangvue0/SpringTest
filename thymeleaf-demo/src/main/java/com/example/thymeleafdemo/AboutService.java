package com.example.thymeleafdemo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class AboutService {

    private List<About> abouts = new ArrayList<>(Arrays.asList(
            new About("Dang", "dang.vue0@gmail.com", "https://github.com/dangvue0/SeleniumJava2022")
    ));

    public List<About> getAllAbouts() {
        return abouts;
    }

    public void addAbout(About about) {
        abouts.add(about);
    }
}
