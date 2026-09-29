package com.sneha.conditionals;

import java.util.Scanner;

public class CheckFourDigit2 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println(" enter a positive integer: ");
        int n = input.nextInt();
        int count = 0;
        while(n >0){
            n = n/10;
            count++;
        }
        if(count == 4){
            System.out.println("4 digit number");
        }

        else System.out.println("the given number is a not a four digit number");
    }

}
