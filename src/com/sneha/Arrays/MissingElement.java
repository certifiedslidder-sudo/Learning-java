package com.sneha.Arrays;

import java.util.Scanner;

public class MissingElement {
    public  static int  missingElement(int[] arr) {
        long n = arr.length +   1 ;   // range of int 2^31 therefore using long to manage constrains
        long sum = n*(n+1)/2;
        long arrsum =  0;
        for (int ele : arr) {
           arrsum += ele;
        }
        return (int)(sum - arrsum);


    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = input.nextInt();
        int[] arr = new int[size-1];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();

        }
        int result = missingElement(arr);
  //      MissingElement obj = new MissingElement();
  //     int result =  obj.missingElement( arr);
        System.out.println("the missing element is " + result  );

    input.close();

    }
}
