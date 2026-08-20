package com.sneha.Arrays;

import java.util.Scanner;

public class SecondLargestElement {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n = input.nextInt();
        System.out.println("enter array elements: ");
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=input.nextInt();
        }
        // calculating the largest element of the array input by user.
        int largest = Integer.MIN_VALUE;
        int SMAX = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            if(arr[i]>largest){
                largest= arr[i];  // updated largest as the max element from array

            }
        }
        // Calculating second largest element of the array input by user.
        for(int i =0;i<n;i++){
            if( arr[i]!= largest && SMAX<arr[i]){     // two conditions applied the current  element should not be equal to largest and shoUld be greater than the value assigned to SMAX
                SMAX = arr[i]; // updated SMAX as the second largest element of array input.
            }
        }
        System.out.println(  "The second largest element of the array is: " + SMAX);
        //System.out.println("Largest element is: "+largest);
    }
}


// MANY PEOPLE DOES THIS BY SORTING HTE ARRAY THEN PRINTING THE (N-1)th element as, if the largest element repeats  in the array  the code will fail in that scenario.
// ex - a[]= {12, 43, -3 , 0,-2 ,-2 , 23}
// after sorting= {-3, -2,-2,0,12,23 ,23}
// and by the logic of printing the (n-1)th element the output will be 23
// which is wrong


//  you can also use else-if