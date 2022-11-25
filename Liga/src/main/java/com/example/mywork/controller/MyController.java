package com.example.mywork.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Controller
public class MyController {

    @RequestMapping("/index")
    public String player(@RequestParam (value = "Username") String Username) {
        try {
            Set<String> str = new HashSet<>();
            save(str, "myList.txt", Username);
            } catch (Exception e) { }
        return "list";
    }

    public static void save(Set<String> obj, String path, String un) throws Exception{
        //1.Считываем все из файла
        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
               obj.add(line);
               line = reader.readLine();
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
    }

    @RequestMapping(value = "/list", method= RequestMethod.GET)
    public String readmodel(Model model) {
        ArrayList<String> list = new ArrayList<String>();
        try {
            File file = new File("myList.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            int i = 0;
            list.add(i, line);
            while (line != null) {
                line = reader.readLine();
                list.add(i++, line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        model.addAttribute("posts", list);
        return "list";
    }
}
