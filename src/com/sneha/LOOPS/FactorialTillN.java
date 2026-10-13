package com.sneha.LOOPS;

import java.util.Scanner;

public class FactorialTillN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
            System.out.println("factorial of " + i + " is " + f);
        }
    }
}
