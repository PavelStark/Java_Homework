package de.telran.Homework;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        String myString = new String("I study Basic Java!");
        myMethode(myString);
    }

static void myMethode (String myString){
       System.out.println(myString);
       myString.charAt(myString.length()-2);

       System.out.println(myString.charAt(myString.length()-2));

       System.out.println(myString.contains("Java"));

       System.out.println(myString.substring(14,18));

       String myJava = myString.substring(14,18);
       System.out.println(myJava.replaceAll("a","o"));

       System.out.println(myJava.toUpperCase());

       System.out.println(myJava.toLowerCase());
}
}


