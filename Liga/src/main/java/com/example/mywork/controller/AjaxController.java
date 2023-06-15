package com.example.mywork.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.io.*;
import java.util.Scanner;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class AjaxController {

    @RequestMapping(value = "/like", method = RequestMethod.POST)
    @ResponseStatus
    public ResponseEntity<?> list(@RequestBody String Username) {
        try {
            File file = setFile();
            FileReader fr = new FileReader(file);
            try (Scanner scanner = new Scanner(fr)) {
                String line;
                while (scanner.hasNextLine()) {
                    line = scanner.nextLine();
                    if (line.equalsIgnoreCase(Username)) {
                        return new ResponseEntity<>(HttpStatus.CONFLICT);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
    public File setFile() {
        return new File("myList.txt");
    }
}
