package com.example.myTimeTable;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class TimeTable {

    public static void main(String[] args) throws FileNotFoundException {
        Professor[] a = new Professor[10];
        FileReader fr = new FileReader ("teachers.txt");
        Scanner scan = new Scanner(fr);
        int i = 0;
        while(scan.hasNextLine()) {
            String str = scan.nextLine();
            a[i] = new Professor();
            a[i].teachersNotFile();
            a[i].teachersFile(str);
            a[i].print();
            i++;
            if(i == 10){
                break;
            }
        }
    }

    public void menu(){
        System.out.print("< Меню для составления расписания >");
        System.out.println("< 1.Вписать преподавателя >");
        System.out.println("< 2.Вывести списко преподавателей >");
        System.out.println("< 3. >");
    }
}
