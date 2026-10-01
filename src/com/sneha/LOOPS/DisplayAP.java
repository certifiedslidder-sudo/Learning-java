package com.sneha.LOOPS;

import java.util.Scanner;

// display ap - 2,5,8,11 upto n terms
public class DisplayAP {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int n = input.nextInt();
        for(int i=2;i<=3*n-1;i+=3){
            System.out.print(i+" ");
        }
    }
}
