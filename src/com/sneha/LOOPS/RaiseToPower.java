package com.sneha.LOOPS;

import java.util.Scanner;

public class RaiseToPower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base value: ");
        int a = input.nextInt();
        System.out.println("Enter exponent: ");
        int b= input.nextInt();
        int p =1;
        for (int i = 1; i <= b; i++) {
        p *= a;
        }
        System.out.println(a +" raised to the power " +b+" is " + p );
    }
}
