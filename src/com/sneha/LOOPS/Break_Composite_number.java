package com.sneha.LOOPS;

import java.util.Scanner;

public class Break_Composite_number {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        boolean flag  = true  ; //  true  means prime
        //for (int i = 2; i <= n-1; i++)
        for (int i = 2; i <= Math.sqrt(n); i++){  // this reduces iterations by 2.
            if(n%i==0) {
                 flag = false;      // false  means composite
                break;
            }
        }            // break finishes the whole loop
        if( n==1 ) System.out.println("neither prime nor composite.");
        else if(flag = false) System.out.println("Composite number");
        else System.out.println("Prime number");
    }

}
