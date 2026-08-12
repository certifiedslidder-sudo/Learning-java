package com.sneha.basics;

public class ASCII_values {
    public static void main(String[] args){
//        a --> 97,    z --> 122
//        A --> 65,    Z --> 90
//        0 --> 48,    9 --> 57
          char ch = 'A';
          // TYPE CASTING =  conversion of one data type into another.
        int x = ch;    // implicit type casting
        System.out.println(x);      // 65

        char piyu = '$';
        int y = (int)piyu;         // EXPLICIT type casting
        System.out.println(y);     //    36

        char piy = ' ';
        int g = (int)piy;         // EXPLICIT type casting
        System.out.println(g);


        char ruhi = '3';
        System.out.println((int)ruhi);    // 51

        // char ch = '33';     -------> ERROR --> YOU CAN'T STORE TWO CHARACTERS IN ' '
        // System.out.println((int)c
        // h);

        char chr = 'b';
        System.out.println(chr + 0);      // 98, char + int = char therefore 98 + 0 = 98
        System.out.println(chr + chr);    // 196
        System.out.println(chr*chr);      // 9604
        System.out.println(chr*1);        // 98
        System.out.println(chr/chr);      // 1
        }
}
