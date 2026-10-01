package com.sneha.LOOPS;

import java.util.Scanner;

// display ap - 2,5,8,11 upto n terms
public class DisplayAP1 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int n = input.nextInt();
        System.out.print(" Enter the first term of AP:");
        int a = input.nextInt();
        System.out.print(" Enter the common difference:");
        int d = input.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            a+=d; // dry run for easy understanding
        }
    }
}
