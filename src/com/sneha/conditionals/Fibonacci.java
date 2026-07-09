package com.sneha.conditionals;

import java.util.Scanner;

public class Fibonacci {
    static void main() {
        // find the nth fibonacci number.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
       int n = in.nextInt();
       int a = 0;
       int b =1;
       int count = 2;
       while(count<=n){
            int temp = b;
            b = b + a ;
            a = temp;
            count++;
       }

        System.out.println(b);
    }
}
