package de.telran.Homework;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        addition();
        subtraction();
        multiplication();
        dividation();
    }
    static void addition (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type in 1st Number: ");
        int num1 = scanner.nextInt();
        System.out.print("Type in 2st Number: ");
        int num2 = scanner.nextInt();
        System.out.print("The result is: ");
        int sum = num1 + num2;
        System.out.println(sum);
    }

    static void subtraction (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type in 1st Number: ");
        int num1 = scanner.nextInt();
        System.out.print("Type in 2st Number: ");
        int num2 = scanner.nextInt();
        System.out.print("The result is: ");
        int sum = num1 - num2;
        System.out.println(sum);
    }
    static void multiplication (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type in 1st Number: ");
        int num1 = scanner.nextInt();
        System.out.print("Type in 2st Number: ");
        int num2 = scanner.nextInt();
        System.out.print("The result is: ");
        int sum = num1 * num2;
        System.out.println(sum);
    }
    static void dividation (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type in 1st Number: ");
        float num1 = scanner.nextInt();
        System.out.print("Type in 2st Number: ");
        float num2 = scanner.nextInt();
        System.out.print("The result is: ");
        float sum = num1 / num2;
        System.out.println(sum);
    }
}
