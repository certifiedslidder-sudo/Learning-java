package com.sneha.functions;

import java.util.Scanner;

public class MaxOfThree_builtIN {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = input.nextInt();
        System.out.println("Enter the second number");
        int b = input.nextInt();
        System.out.println("Enter the third number");
        int c = input.nextInt();
        System.out.print("The Greatest of the given three numbers is: ");
        System.out.println(Math.max(Math.max(a,b),c));
    }
}
