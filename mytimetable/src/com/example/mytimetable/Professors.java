package com.example.mytimetable;

import java.io.*;
import java.util.*;
public class Professors {
    private String name;
    private String[] object;

    public Professors() {
        name = new String();
        object = new String[3];
    }

    public void Create_list(Professors p){
        p.teachers_not_file();
        p.teachers_file();
        p.print();
    }

    public void teachers_not_file(){
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        int h = 0, a = 0;
        System.out.print("Чтобы добавить преподавателя нажмите 1, иначе 0: ");
        h = scan1.nextInt();
        while(h == 1) {
            System.out.print("Введите ФИО через пробел, через комбинацию ' , ' введите до трех предметов, которые он преподает: ");
            String str = scan.nextLine();
            String[] params = str.split(",");
            for(int f = 0; f < params.length; f++) {
                if(f == 0) {
                    name = params[f];
                }else {
                    object[a] = params[f];
                    a++;
                }
            }
            System.out.print("Чтобы добавить преподавателя нажмите 1, иначе 0: ");
            h = scan1.nextInt();
        }
        scan.close();
    }
    public void teachers_file() {
        try {
            FileReader fr = new FileReader ("teachers.txt");
            Scanner scan = new Scanner(fr);
            int a = 0;
            while(scan.hasNextLine()) {
                String str = scan.nextLine();
                String[] params = str.split(",");
                for(int f = 0; f < params.length; f++) {
                    if(f == 0) {
                        name = params[f];
                    } else {
                        object[a] = params[f];
                        a++;
                    }
                }
            }
            scan.close();
        }
        catch(IOException e)
        {
            System.err.println("Ошибка файла: " + e);
        }
    }

    public void print() {
        System.out.println("ФИО: " + name);
        for(int j = 0; j < object.length; j++) {
            System.out.print("Предмет: " + object);
        }
        System.out.println();
    }
}
