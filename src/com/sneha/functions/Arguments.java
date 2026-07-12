package com.sneha.functions;

import java.util.Scanner;

public class Arguments {
    static void main() {
        //int ans =   sum2();
       //System.out.println("The answer is: " + ans);

        int ans = sum3(20,40);
        System.out.println("The sum is " + ans);

    }
// pass the value of numbers when you are calling the method in main()

    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }

    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("enter number 1: ");
        int num1 =  in.nextInt();
        System.out.print("enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }
    static void sum(){

    }

}