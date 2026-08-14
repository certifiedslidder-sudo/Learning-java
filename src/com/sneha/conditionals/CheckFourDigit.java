package com.sneha.conditionals;

import java.util.Scanner;

public class CheckFourDigit {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println(" enter a positive integer: ");
        int n = input.nextInt();
        // ALTERNATE CONDITION --> if(n%1000) 
        if (n >999 && n<10000) System.out.println("the given number is a four digit number");
        else System.out.println("the given number is a not a four digit number");
    }

}
