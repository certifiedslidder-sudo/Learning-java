package com.sneha.LOOPS;
 // print sequence // 1  n  2  n-1  3  n-2  4...
import java.util.Scanner;

public class DisplaySequence {
    static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number");
    int n = input.nextInt();
         for (int i=1;i<n;i++){
        System.out.println(i);
        System.out.println(n);
        n--;

    }
  }
}
