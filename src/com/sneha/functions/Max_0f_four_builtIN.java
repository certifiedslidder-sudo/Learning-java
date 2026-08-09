package com.sneha.functions;

import java.util.Scanner;

public class Max_0f_four_builtIN {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = input.nextInt();
        System.out.println("Enter the second number");
        int b = input.nextInt();
        System.out.println("Enter the third number");
        int c = input.nextInt();
        System.out.println("Enter the fourth number");
        int d= input.nextInt();
        System.out.print("The Greatest of the given four numbers is: ");
        System.out.println(Math.max(Math.max(Math.max(a,b),c),d));
    }

}
