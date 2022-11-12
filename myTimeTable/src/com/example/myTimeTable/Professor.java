package com.example.myTimeTable;

import java.util.*;
public class Professor {
    private String name;
    private String[] object;

    public Professor() {
        this.name = new String();
        this.object = new String[3];
    }

    public Professor(String name, String obj1, String obj2, String obj3){
        this.name = name;
        this.object[0] = obj1;
        this.object[1] = obj2;
        this.object[2] = obj3;
    }
    public void teachersNotFile(){
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        int h1 = 0;
        System.out.print("Чтобы добавить преподавателя нажмите 1, иначе 0: ");
        h1 = scan1.nextInt();
        while(h1 == 1) {
            System.out.print("Введите ФИО через пробел, через комбинацию ' , ' введите до трех предметов, которые он преподает: ");
            System.out.println("Должен быть введен хотя бы один предмет, вместо пропуска предмета ставьте -");
            String str = scan.nextLine();
            String[] params = str.split(",");
            this.name = params[0];
            this.object[0] = params[1];
            this.object[1] = params[2];
            this.object[2] = params[3];
            System.out.print("Чтобы добавить преподавателя нажмите 1, иначе 0: ");
            h1 = scan1.nextInt();
        }
    }
    public void teachersFile(String str) {
        String[] params = str.split(",");
        this.name = params[0];
        this.object[0] = params[1];
        this.object[1] = params[2];
        this.object[2] = params[3];
    }

    public void print() {
        System.out.println("ФИО: " + name);
        for(int j = 0; j < object.length; j++) {
            System.out.println("Предмет: " + object[j]);
        }
        System.out.println();
    }
}
