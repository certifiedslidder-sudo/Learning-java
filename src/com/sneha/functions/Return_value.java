package com.sneha.functions;

import java.util.Scanner;

public class Return_value {
    static void main() {
     int ans =   sum2();
        System.out.println("The answer is: " + ans);

    }

    // return the value
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("enter number 1: ");
        int num1 =  in.nextInt();
        System.out.print("enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;    //function ends here , any line after this won't execute
    }
      static void sum(){
       // Scanner in = new Scanner(System.in);
//        System.out.print("enter number 1: ");
//        int num1 =  in.nextInt();
//        System.out.print("enter number 2: ");
//        int num2 = in.nextInt();
//        int sum = num1 + num2;
//        System.out.println("The sum is " + sum);
    }

}