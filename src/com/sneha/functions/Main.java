package com.sneha.functions;

import java.util.Scanner;

public class Main {
    static void main() {

        // que - take input of two numbers and  print the sum
        Scanner in = new Scanner(System.in);
        System.out.print("enter number 1: ");
        int num1 =  in.nextInt();
        System.out.print("enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is " + sum);
    }
}
