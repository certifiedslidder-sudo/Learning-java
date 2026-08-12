package com.sneha.Arrays;

import java.util.Scanner;

public class OutputInputArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int[] arr = {5,-2,9,6,5,45};   // length of array = 6
//        //System.out.println(arr.length);
//        int n = arr.length;
//        for (int i=0; i<n; i++){
//            System.out.println(arr[i] +" ");
//        }
        int[] sneha = new int[7];
        // DEFAULT VALUES
        //    for(int i =0; i<=6;i++){
        //        System.out.print(sneha[i] + " "); // here we created an array of size 7 whose default value of each element is 0

//        }
        // INPUT
        for (int i = 0; i < 7; i++) {
            sneha[i] = input.nextInt();

        }
        // PRINT
        for(int i =0;i<7;i++){
            System.out.print(sneha[i] + " ");
        }
    }
}
