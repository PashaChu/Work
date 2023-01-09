package com.example.mywork.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import java.io.*;
import java.util.Scanner;

@RestController
public class AjaxController {
    @RequestMapping(value = "/like", method = RequestMethod.POST)
    @ResponseStatus
    public ResponseEntity<?> list(@RequestBody String Username) {
        try {
            File file = new File("myList.txt");
            FileReader fr = new FileReader(file);
            Scanner scanner = new Scanner(fr);
            String line;
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                if (line.equalsIgnoreCase(Username)) {
                    return new ResponseEntity<>("", HttpStatus.CONFLICT);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>("", HttpStatus.OK);
    }
}


