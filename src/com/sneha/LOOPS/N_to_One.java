package com.sneha.LOOPS;

import java.util.Scanner;

public class N_to_One {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=input.nextInt();
        for(int i=n;i>=1;i--){
            System.out.println(i);
        }
    }
}
