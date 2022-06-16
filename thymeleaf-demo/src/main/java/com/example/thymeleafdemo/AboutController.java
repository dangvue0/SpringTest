package com.example.thymeleafdemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController

public class AboutController {

    @Autowired
    private AboutService aboutService;

    public AboutController() {
    }
    @RequestMapping(value = "/about", method = RequestMethod.GET)
//    @GetMapping("/about")
    public List<About> getAllAbout() {
        return aboutService.getAllAbouts();
    }

    @RequestMapping(value = "/about", method = RequestMethod.POST)
    public void addAbout(@RequestBody About about) {
        aboutService.addAbout(about);
    }

    @GetMapping(value = "/about/user/{name}")
    public About findByName (@PathVariable String name) {
        return aboutService.findByName(name);
    }

    @GetMapping(value = "/about/{id}")
    public About findById (@PathVariable int id) {
        return aboutService.finById(id);
    }
}

