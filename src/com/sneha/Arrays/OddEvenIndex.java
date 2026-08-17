package com.sneha.Arrays;

import java.util.Scanner;

public class OddEvenIndex {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = input.nextInt();
        System.out.println("enter array elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
            if(i %2 == 0){
                arr[i] += 10;

            }
            else {
                arr[i] *= 2;
            }
            System.out.print(arr[i] + " ");
        }

    }
}
