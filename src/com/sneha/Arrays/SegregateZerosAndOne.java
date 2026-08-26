package com.sneha.Arrays;
import java.util.Scanner;
public class SegregateZerosAndOne {
    public static void segregate(int[] arr){
        int n = arr.length;
        int i =0, j = n-1;
        while(i<j){
            if(arr[i]== 0) i++;
            else if(arr[j] == 1) j--;
          //   else if(i>j) break;           // try for [0 0 0 1 0], with if statement , no need to use this condition if you are using else if.
            else if (arr[i] == 1 && arr[j] == 0) {
                arr[i] = 0;
                arr[j] =1;
        }
        }
        for(int k =0;k<n;k++){
            System.out.print(arr[k] +" ");
        }
        System.out.println();
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
       segregate(arr);
        sc.close();
    }
}
