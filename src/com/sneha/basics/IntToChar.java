package com.sneha.basics;

public class IntToChar {
    static void main() {
        int x = 43;     //  gives    +
        char ch = (char)x;        // explicit type casting
        System.out.println(ch);

        int y = 32;   // gives " " {SPACE}
        char chr = (char)y;
        System.out.println(chr);

        int z = 29;   // gives          no character             like y = 31 2 3 28 etc
        char chrr = (char)z;
        System.out.println(chr);
    }
}
