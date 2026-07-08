package com.sneha;

import java.util.Scanner;
// both the data type should be compatible;
//  destination type > source type , java performs automatic type conversion


public class TypeCasting {
    static void main() {
       Scanner input = new Scanner(System.in);
//        int num = input.nextFloat();            won't work
//        float num = input.nextFloat();
//        System.out.println("num =" + num);
//        int num = (int) (98.544f);                //explicit typecasting
//        System.out.println(num);

        //automatic type promotion in expresssion
//        int a = 257;
//        byte b = (byte) (a);       // max value a byte can store =256
//        System.out.println(b);    // gives 1 (input value %  max value)  {257%256}

//        byte a = 40;
//        byte b = 50;
//        byte c= 100;    //how is byte able to store 2000(40*50)???????
//        int d = (a*b)/c;  // java is automatically promoting each byte to integer when its performing the operation
//        System.out.println(d);

        // byte b= 50;
        // b = b*2;    // int cannot be assigned to byte automatically(implicit).
    /*
    Yes, Java follows the Unicode principle. Java's char data type and string handling mechanisms are built around the
    Unicode standard, allowing developers to work with a wide range of characters seamlessly
    */
//        int number = 'a';
//        System.out.println(number);

        byte b = 42;
        char c = 'a';
        short s = 11024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);    // float + integer - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println("result = " + result);



    }
}
