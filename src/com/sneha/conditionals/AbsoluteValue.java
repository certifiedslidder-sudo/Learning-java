package com.sneha.conditionals;
 // wap to print the absolute value of number entered by user.
import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = input.nextInt();
        if (num >= 1){
            System.out.println(" the absolute value of " + num + " is " + num);
        }
        else{
            System.out.println(" the absolute value of " + num + " is " + -num);
        }
    }
}
