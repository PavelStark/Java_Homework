package de.telran.Homework;


import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {

        String myString;
        String myString2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type in first word: ");
        myString = scanner.nextLine();
        System.out.println("Character count: " +myString.length());

        System.out.println("Type in second word: ");
        myString2 = scanner.nextLine();
        System.out.println("Character count: " +myString2.length());

        System.out.println(myString.substring(0,myString.length()/2) + myString2.substring(myString.length()/2));

    }
}
