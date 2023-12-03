package com.example.mywork.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

@Controller
@CrossOrigin(origins = "http://localhost:8080")
public class ListController {
    @RequestMapping(value = "/list", method= RequestMethod.GET)
    public String readmodel(Model model) {
        ArrayList<String> list = new ArrayList<String>();
        try {
            File file = new File("myList.txt");
            FileReader fr = new FileReader(file);
            try (BufferedReader reader = new BufferedReader(fr)) {
                String line = reader.readLine();
                int i = 0;
                list.add(i, line);
                while (line != null) {
                    line = reader.readLine();
                    list.add(i++, line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        model.addAttribute("posts", list);
        return "list";
    }
}
