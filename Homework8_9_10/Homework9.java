package de.telran.Homework.Homework8_9_10;

    /*Дз No2
    Реализуйте программу, которая попросит пользователя ввести год и напечатать этот год isLeap (високосный) или нет.*/

import java.util.Scanner;

public class Homework9 {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите год: ");
                int year = scanner.nextInt();
                scanner.close();

                boolean isLeap = isLeapYear(year);

                if (isLeap) {
                    System.out.println(year + " является високосным годом.");
                } else {
                    System.out.println(year + " не является високосным годом.");
                }
            }
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true; // Год високосный
        } else {
            return false; // Год не високосный
        }
    }
}


