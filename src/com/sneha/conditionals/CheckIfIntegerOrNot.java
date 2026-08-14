package com.sneha.conditionals;

import java.util.Scanner;

public class CheckIfIntegerOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double n = input.nextDouble();
        if(n - (int)n == 0) System.out.println("the given number is  an integer");     // 6.0 - 6 = 0 so integer ,       6.9 - 9 = .9   not an integer
        else System.out.println("the given number is not  an integer");


    }
}
