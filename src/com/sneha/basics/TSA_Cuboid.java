package com.sneha.basics;

import java.util.Scanner;

public class TSA_Cuboid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double l = input.nextDouble();
        double b = input.nextDouble();
        double h = input.nextDouble();
        double  tsa =2*(l*b + b*h + h*l);
        System.out.println(tsa);
    }
}
