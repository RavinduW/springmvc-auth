package com.wdr.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/getLoginPage")
    public String getLoginPage(){
        return "login";
    }
}
