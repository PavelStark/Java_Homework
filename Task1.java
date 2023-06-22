package org.telran.practik;

public class Task1 {
    public static void main(String[] args) {
        char myChar = 'G';
        int myInt = 89;
        byte myByte = 4;
        short myShot = 56;
        float myFloat = 4.7333436F;
        double myDouble = 4.355453532;
        long myLong = 12121;

        Character myCharacter = 'G';
        Integer myInteger = 89;
        Byte myByte2 = 4;
        Short myShort2 = 56;
        Float myFloat2 = 4.7333436F;
        Double myDouble2 = 4.355453532;
        Long myLong2 = 12121L;

        System.out.println(myChar);
        System.out.println(myInt);
        System.out.println(myByte);
        System.out.println(myShot);
        System.out.println(myFloat);
        System.out.println(myDouble);
        System.out.println(myLong);
        System.out.println(myCharacter);
        System.out.println(myInteger);
        System.out.println(myByte2);
        System.out.println(myShort2);
        System.out.println(myFloat2);
        System.out.println(myDouble2);
        System.out.println(myLong2);

        Digits();
    }
    static void Digits() {
        int number = 345;
        int digit1 = 345 / 100;
        int digit2 = (number / 10) % 10;
        int digit3 = number % 10;
        System.out.println(digit1 + "," + digit2 + "," + digit3);
    }
}