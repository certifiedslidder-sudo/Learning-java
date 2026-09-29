package com.sneha.conditionals;

import java.util.Scanner;

public class Largest {
    static void main() {
        // find the largest of 3 number


        // YOU CAN ALSO DO IT BY NESTED IF ELSE
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the 1st numbers ");
        int a = sc.nextInt();
        System.out.print("enter the 2nd numbers ");
        int b = sc.nextInt();
        System.out.print("enter the 3rd numbers ");
        int c = sc.nextInt();
        int max = a;
        if(b> max){
            max=b;
        }
        if(c>max){
            max =c;
        }
        /*
        int max=0;
        if (a > b) {
            max=a;
        }else{
            max=b;
        }if (c > max) {
            max=c;
        }
        */

//   or   you can also use Math.max
//        System.out.println(Math.max(12,32));
//        System.out.println(max);

        System.out.println("the largest of the 3 given number is = "+max);
    }
}
