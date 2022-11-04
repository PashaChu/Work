package com.example.mywork.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

@Controller
public class MyController {

    @RequestMapping("/index")
    public String player(@RequestParam (value = "Username") String Username) {
        try {
            Files.write(Paths.get("myList.txt"), ("\n" + Username).getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {

        }
        return "List";
    }

    @RequestMapping("/List")
    public ModelAndView index () {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("List");
        return modelAndView;
    }


}
