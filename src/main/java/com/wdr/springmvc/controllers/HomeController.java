package com.wdr.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String showHome(){
        return "home";
    }

    @GetMapping("/leaders")
    public String showLeaders(){
        return "manager/leaders";
    }

    @GetMapping("/systems")
    public String showSystems(){
        return "admin/systems";
    }

}
