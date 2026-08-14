package com.sneha.conditionals;

import java.util.Scanner;

public class ElseIfLadder {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println(" enter a positive integer: ");
        int n = input.nextInt();
        if(n % 5 == 0)
        {
            System.out.println("the number is divisible by 5");
        }
        else if ( n % 3 == 0)
        {
            System.out.println("the number is divisible by 3");
        }
        else if ( n % 5 == 0 && n % 3 == 0 )
        {
            System.out.println(" the number is divisible by both 5 and 3.");
        }
        else System.out.println("tne number is not divisible by 5 or 3");


    }
}
