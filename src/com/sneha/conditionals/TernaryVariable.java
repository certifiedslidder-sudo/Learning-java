package com.sneha.conditionals;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TernaryVariable {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        int prasun = (n>=0)?100:0;
        System.out.println(prasun);
    }
}
