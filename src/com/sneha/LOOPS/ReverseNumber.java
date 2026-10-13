package com.sneha.LOOPS;

import java.util.Scanner;

public class ReverseNumber {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int reverse = 0;
        while(num!=0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
            System.out.println("Reversed number is: "+ reverse);

    }
}
