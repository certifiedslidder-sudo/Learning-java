package com.sneha.conditionals;

import java.util.Scanner;

public class Quadrant {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the point x: ");
        int x = input.nextInt();
        System.out.print("Enter the point y: ");
        int y = input.nextInt();
        if(x>0 && y>0) System.out.println("the point lies on first quadrant");
        else if(x>0 && y<0) System.out.println("the point lies in second quadrant");
        else if(x<0 && y<0) System.out.println("the point lies in third quadrant");
        else if(x<0 && y>0) System.out.println("the point lies in fourth quadrant");
        else if(x == 0 && y==0) System.out.println(" the point lies at origin");
        else if(y==0) System.out.println("the point lies on x axis");
        else if(x==0) System.out.println("the point lies on y axis");

    }
}
