package com.example.mywork.controller;

import org.springframework.web.bind.annotation.*;

import java.io.*;

@RestController
public class AjaxController {
    @RequestMapping(value = "/like", method = RequestMethod.POST)
    public String list(@RequestParam(value = "Username") String Username) {
        try {
            File file = new File("myList.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                line = reader.readLine();
                if(line.equals(Username)){
                    return "Игрок уже есть в списке.";
                }
            }
            if(line == null){
                return "Игрок записан.";
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) { }
        return "Игрок записан.";
    }
}

