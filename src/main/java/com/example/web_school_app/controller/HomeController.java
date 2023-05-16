package com.example.web_school_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    //<---------EXAMPLE 19 OF COURSE
//    @RequestMapping(value={"","/","home"})
//    public String displayHomePage(Model model){
//        model.addAttribute("username","KaushalCha");
//        return "home.html";
//    }
@RequestMapping(value={"","/","home"})
public String displayHomePage(){
    return "home.html";
}
}