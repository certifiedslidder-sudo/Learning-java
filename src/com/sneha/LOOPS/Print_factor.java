package com.sneha.LOOPS;

import java.util.Scanner;

public class Print_factor {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for (int i = 1; i <= Math.sqrt(n) ; i++) {
            if(n%i == 0) {
                System.out.println(i);
              //  System.out.println(n/i);
            }
            if(n/i!=i) {
                System.out.println(i);
            }
        }
    }
}
