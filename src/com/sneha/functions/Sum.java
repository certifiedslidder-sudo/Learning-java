package com.sneha.functions;

import java.util.Scanner;

public class Sum {
    static void main() {
    sum();           // calling the function
    sum();       // can call as many timev
    }
    static void sum(){      // static
        Scanner in = new Scanner(System.in);
        System.out.print("enter number 1: ");
        int num1 =  in.nextInt();
        System.out.print("enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is " + sum);
    }
    /*
            return_type name(arguments){
                 // body
            return statement;
                              }
     */





}
