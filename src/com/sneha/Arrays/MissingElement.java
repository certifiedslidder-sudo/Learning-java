package com.sneha.Arrays;

import java.util.Scanner;

public class MissingElement {
    public int  missingElement(int[] arr) {
        int n = arr.length;
        int sum = n*(n+1)/2;
        int arrsum =  0;
        for (int ele : arr) {
           arrsum += ele;
        }
        return  sum - arrsum;


    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();

        }
        MissingElement obj = new MissingElement();
       int result =  obj.missingElement( arr);
        System.out.println("the missing element is" + result  );
      


    }
}
