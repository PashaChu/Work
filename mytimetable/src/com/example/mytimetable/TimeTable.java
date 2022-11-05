package com.example.mytimetable;


public class TimeTable {
    public static int a = 10;

    public static void main(String[] args) {
        Professors[] list = new Professors[a];
        for(int i = 0; i < list.length; i++) {
            list[i].Create_list(list[i]);
        }
    }



    public void Menu(){
        System.out.print("< Меню для составления расписания >");
        System.out.println("< 1.Вписать преподавателя >");
        System.out.println("< 2.Вывести списко преподавателей >");
        System.out.println("< 3. >");
    }
}
