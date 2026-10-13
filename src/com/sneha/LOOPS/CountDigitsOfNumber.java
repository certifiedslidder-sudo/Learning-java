package com.sneha.LOOPS;

import java.util.Scanner;

public class CountDigitsOfNumber {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        int count = 0;
        while(n!=0){
             n/=10;
            count ++;
        }
        System.out.println( "The no. of digits in the given number is: "+count);
    }
}
