package com.example.myTimeTable;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class TimeTable {

    public static void main(String[] args) throws FileNotFoundException {
        Week b = new Week();
        Professor[] a = new Professor[10];
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        int i = 0, h = 9;
        do {
            menu();
            System.out.println("Введите номер действия из предложенного меню: ");
            h = scan1.nextInt();
            switch (h) {
                case (1):
                    System.out.println("Введите ФИО через пробел, через комбинацию ' , ' введите до трех предметов, которые он преподает: ");
                    System.out.println("Должен быть введен хотя бы один предмет, вместо пропуска предмета ставьте -");
                    do {
                        a[i] = new Professor();
                        a[i].teachersNotFile();
                        i++;
                        if (i == 10) break;
                        System.out.print("Чтобы добавить преподавателя нажмите 1, иначе 2: ");
                        h = scan1.nextInt();
                    }while(h != 2);
                    break;
                case (2):
                    FileReader frT = new FileReader ("teachers.txt");
                    Scanner scan_frT = new Scanner(frT);
                     do{
                        String str = scan_frT.nextLine();
                        a[i] = new Professor();
                        a[i].teachersFile(str);
                        i++;
                        if (i == 10) break;
                    }while (scan_frT.hasNextLine());
                    break;
                case (3):
                    System.out.println("Список преподавателей:");
                    for(int k = 0; k < 10; k++){
                        if(a[k] == null)break;
                        a[k].print();
                    }
                    break;
                case (4):
                    if(a[0] != null){
                        String str = new String();
                        System.out.println("Введите название группы и номер аудитории через ' , ', которые хотите добавить в расписание: ");
                        str = scan2.nextLine();
                        String[] params = str.split(",");
                        b.writeGroup(params[0]);
                        b.writeRoom(params[1]);
                        b.copy(a[0]);
                        b.writeObj(a[0].setObject(0));
                    }
                    break;
                case(5):
                    b.printWeek();
                    break;
            }
        }while(h > 0);
    }

    public static void menu(){
        System.out.println("< Меню для составления расписания:                   >");
        System.out.println("< 1.Записать преподавателя в список                  >");
        System.out.println("< 2.Переписать преподавателей из файла в список      >");
        System.out.println("< 3.Вывести список преподавателей                    >");
        System.out.println("< 4.Заполнение расписания                            >");
        System.out.println("< 5.Вывести расписание                               >");
        System.out.println("< 0.Закончить работу                                 >");
    }
}
