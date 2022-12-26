package com.example.mywork.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AjaxController {

    @RestController
    public class ProductController {
        @RequestMapping(value = "/index", method= RequestMethod.GET)
        public String list(@RequestParam (value = "Username") String Username, Model model){
            List<String> player = new ArrayList<>();
            player.add(Username);
            String str = "Игрок " + Username + " уже был отмечен.";
            String str1 = "Игрока нет в списке";
            try {
                File file = new File("myList.txt");
                FileReader fr = new FileReader(file);
                BufferedReader reader = new BufferedReader(fr);
                String line = reader.readLine();
                while (line != null) {
                    line = reader.readLine();
                    if(player.toString() == line){
                        model.addAttribute("player", str);
                    } else {
                        model.addAttribute("player", str1);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return "index";
        }
    }
}
