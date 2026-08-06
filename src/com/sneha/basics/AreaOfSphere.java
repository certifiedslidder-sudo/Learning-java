package com.sneha.basics;

import java.util.Scanner;

public class AreaOfSphere {
    static void main() {
        Scanner input = new Scanner(System.in);
        double r =  input.nextDouble() ;
        double a = 4/3*3.141592*r*r*r;
        System.out.println(a);
    }
}
