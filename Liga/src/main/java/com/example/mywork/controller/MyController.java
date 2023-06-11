package com.example.mywork.controller;

import org.springframework.web.bind.annotation.*;
import java.io.*;
import java.util.HashSet;
import java.util.Set;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class MyController {
    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public void player(@RequestBody String Username) {
        try {
                Set<String> str = new HashSet<>();
                save(str, "myList.txt", Username);
        } catch (Exception e) { }
    }

    public static Object save(Set<String> obj, String path, String un) throws Exception{
        //1.Считываем все из файла
        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);
            try (BufferedReader reader = new BufferedReader(fr)) {
                String line = reader.readLine();
                while (line != null) {
                   obj.add(line);
                   line = reader.readLine();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //2.Добавляем параметр в Set
        obj.add(un);
        //3.Очищаем файл
        new PrintWriter(path).close();
        //4.Записываем все элементы Set
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        for(Object object : obj) {
            String element =(String) object;
            writer.write(element);
            writer.write("\n");
        }
        writer.close();
        return 1;
    }
}
