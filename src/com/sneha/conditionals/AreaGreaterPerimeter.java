package com.sneha.conditionals;

import java.util.Scanner;

public class AreaGreaterPerimeter {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of rectangle: ");
        int lenght = input.nextInt();
        System.out.print("Enter the width of rectangle: ");
        int width = input.nextInt();
        int area = lenght * width;
        int perimeter = 2*(lenght + width) ;
        if(area > perimeter) System.out.println("the area is greater than perimeter");
        else System.out.println("the area is less than perimeter");
    }
}
