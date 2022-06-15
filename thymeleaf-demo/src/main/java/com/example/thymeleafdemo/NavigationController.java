package com.example.thymeleafdemo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigationController {

    @GetMapping("/hrc")
    public String getHRC(){
        return "hrc";
    }

    @GetMapping("/photos")
    public String getPhotos(){
        return "photos";
    }

    @GetMapping("/pokemon")
    public String getPokemon(){
        return "pokemon";
    }
}
