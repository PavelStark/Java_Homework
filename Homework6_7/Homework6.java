package de.telran.Homework.Homework6_7;

/*Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
  Числа могут быть, как целочисленные, так и дробные.
  Например :
  ввод : m=10.5, n=10.45
  вывод: Число 10.45 ближе к 10.*/

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {

        double m;
        double n;

        Scanner scan = new Scanner(System.in);
        System.out.println("type in first number: ");
        m = scan.nextDouble();

        System.out.println("type in second number: ");
        n = scan.nextDouble();

        double mPos = m -10;
        double nPos = n -10;

        if (mPos < 0){
            mPos = - mPos;
        }

        if (nPos < 0){
            nPos = - nPos;
        }

        if (mPos < nPos ) {
            System.out.println("Number: " +m+ " is near to 10");
        }
        else if (nPos < mPos){
            System.out.println("Number: " +n+ " is near to 10");
        }
        else {
            System.out.println("Numbers are same");
        }
    }
}

