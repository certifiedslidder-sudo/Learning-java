package com.sneha.LOOPS;

import java.util.Scanner;

// display gp 1,2,4,8 upto n terms.
public class DisplayGP {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter number");
         int n = input.nextInt();
         int a=1, r =2;
         for (int i=1;i<n;i++){
             System.out.println(a);
             a*=r;
         }
     }
}
