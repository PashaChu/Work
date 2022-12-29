package com.example.mywork.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.io.*;

@RestController
public class AjaxController {
    @RequestMapping(value = "/like", method = RequestMethod.POST)
    public void list(@RequestParam(value = "Username") String Username) {
        try {
            File file = new File("myList.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                line = reader.readLine();
                if(line.equals(Username)){
                    throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
                }
            }
            if(line == null){
                throw new ResponseStatusException(HttpStatus.OK);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) { }
        throw new ResponseStatusException(HttpStatus.OK);
    }
}

