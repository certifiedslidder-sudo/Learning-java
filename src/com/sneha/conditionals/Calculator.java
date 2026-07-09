package com.sneha.conditionals;

import java.util.Scanner;

public class Calculator {
    static void main() {
        Scanner in = new Scanner(System.in);
        //  take input from user till user does not press x or X.
        int ans = 0;
        while (true) {
            // take the operator as input
            System.out.print("enter the operator:");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // input two numbers
                System.out.print("enter two numbers:");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else{
                        System.out.println("cannot divide by 0");
                        continue;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid input");
            }

            System.out.println(ans);
        }


    }
}

