package com.sneha.LOOPS;
 // print the series 99, 95,91,87
import java.util.Scanner;

public class DisplayAP2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int n = input.nextInt();
        for (int i = 99; i >0; i-=4) {
            System.out.print(i+" ");
        }
    }
}
