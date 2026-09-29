package com.sneha.conditionals;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

// take 3 positive integers input and tell if they can be the sides of a triangle or not
public class SidesTriangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st side");
        int a = sc.nextInt();
        System.out.println("Enter 2nd side");
        int b = sc.nextInt();
        System.out.println("Enter 3rd side");
        int c = sc.nextInt();
        if(a+b>c && b+c>a && c+a>b){
            System.out.println("Valid triangle");
        }
        else System.out.println("Invalid triangle");

    }
}
