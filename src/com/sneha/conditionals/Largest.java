package com.sneha.conditionals;

import java.util.Scanner;

public class Largest {
    static void main() {
        // find the largest of 3 number
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
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
