package com.sneha.conditionals;

import java.util.Scanner;

public class DivivsibleBy_FIVE {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        if(n % 5 ==0) System.out.println("the number is divisible by 5!");
        else System.out.println("the number is not divisible by 5!");
    }
}
