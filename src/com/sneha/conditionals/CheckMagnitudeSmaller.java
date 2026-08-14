package com.sneha.conditionals;

import java.util.Scanner;

public class CheckMagnitudeSmaller {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println(" enter a positive integer: ");
        int n = input.nextInt();
        if(n>=1)  {
            if(n > 69){
                System.out.println(" the magnitude of given number is greater than 69");
            }
            else System.out.println("the magnitude of given number is  smaller than 69");
        }
        else if(n<1)  {
            n = -n;
            if(n > 69){
                System.out.println(" the magnitude of given number is greater than 69");
            }
            else System.out.println("the magnitude of given number is   smaller than 69");
        }
    }
}
