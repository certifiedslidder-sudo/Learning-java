package com.sneha.LOOPS;

import java.util.Scanner;

public class SumOfDigits {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int sum =0;
        while(num!= 0) {
           sum += (num%10);  // this stored the last digit od the number
           num/=10;   // it reduces the number by one digit.

        } /// for -ve digit we studied (-a)%b = -(a%b) thus the sum will be -ve    or we can also use ternary operator while printing.
       System.out.println("Sum is: "+ sum);
     //   System.out.println((sum>0)?sum:-sum);
    }
}
