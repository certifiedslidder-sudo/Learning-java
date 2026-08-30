package com.sneha.LOOPS;

import java.util.Scanner;

public class PrintSneha {
    static void main() {
        System.out.println("enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("enter n: ");
        int n = sc.nextInt();
        for(int i = 0; i <n ; i++) {
            System.out.println(name);
        }
    }
}
