package de.telran.Homework;

        /*Есть устройство, на табло которого показывается количество секунд, оставшихся до конца рабочего дня.
        Когда рабочий день начинается ровно в 9 часов утра — табло отображает «28800» (т.е. остаётся 8 часов),
        когда 14:30 — на табло «9000» (т.е. остаётся два с половиной часа), а когда наступает 17 часов —
        на табло отображается «0» (т.е. рабочий день закончился).
        Некоторый сотрудники не умеют оценивать остаток рабочего дня в секундах.
        Требуется написать программу, которая вместо секунд будет выводить на табло понятные фразы с информацией
        о том, сколько полных часов осталось до конца рабочего дня.
        Например: «осталось 7 часов», «осталось 4 часа», «остался 1 час», «осталось менее часа».
        Объяснение: в переменную n должно записываться случайное (на время тестирования программы)
        целое число из диапазона от 0 до 28800, далее оно должно выводиться на экран
        (для тех, кто понимает в секундах) и на следующей строке (для тех кто не понимает) должна
        выводиться фраза о количестве полных часов, содержащихся в n секундах.*/

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сколько секунд осталось ");
        int sec = sc.nextInt();
        if (sec >= 0 && sec <= 28_800) {
            double min = sec/60;
            int hours = (int)min/60;
            int hoursMin = (int)min%60;
            double MinSec = sec - ((hours * 60 * 60) + (hoursMin * 60));
            int hoursMinSec = (int)MinSec;
            System.out.println("Осталось работать: " + sec + " секунд");
            System.out.println("Осталось работать: " + hours + " часа " + hoursMin + " минут " + hoursMinSec + " секунд");
        } else {
            System.out.println("Введено неправильное значение");
        }
    }
}
