package com.cg.userform.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
public class FormController {

    @GetMapping("/")
    public String showPage1() {
        return "page1";
    }

    @PostMapping("/page2")
    public String handlePage1(@RequestParam String firstName,
                              @RequestParam String lastName,
                              Model model) {
        model.addAttribute("firstName", firstName);
        model.addAttribute("lastName", lastName);
        return "page2";
    }

    @PostMapping("/page3")
    public String handlePage2(@RequestParam String firstName,
                              @RequestParam String lastName,
                              @RequestParam String email,
                              @RequestParam String phone,
                              Model model) {
        model.addAttribute("firstName", firstName);
        model.addAttribute("lastName", lastName);
        model.addAttribute("email", email);
        model.addAttribute("phone", phone);
        return "page3";
    }

    @PostMapping("/page4")
    public String handlePage3(@RequestParam String firstName,
                              @RequestParam String lastName,
                              @RequestParam String email,
                              @RequestParam String phone,
                              @RequestParam String city,
                              @RequestParam String country,
                              Model model) {
        model.addAttribute("firstName", firstName);
        model.addAttribute("lastName", lastName);
        model.addAttribute("email", email);
        model.addAttribute("phone", phone);
        model.addAttribute("city", city);
        model.addAttribute("country", country);
        return "page4";
    }
}

