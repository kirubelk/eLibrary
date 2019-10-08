package edu.mum.cs.cs425.elibrary.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomepageController {

    @GetMapping(value = {"/","/elibrary"})
    public String homepage() {
        return "home/index";
    }
}