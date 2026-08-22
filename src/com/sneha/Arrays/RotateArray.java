package com.sneha.Arrays;
import java.util.Scanner;
public class RotateArray {
    public void rotateArr(int arr[], int d) {
        int n = arr.length;
        d = d % n;    // this will work for d>n and in generall as well
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }           // we'll use d= d%n thus d becomes d<n
    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
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
        System.out.println("enter d: ");
        int d = sc.nextInt();
        RotateArray obj = new RotateArray();
        obj.rotateArr(arr, d);
        System.out.println("the rotated array is: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        sc.close();
    }
}

// LOGIC1
// for k =3
//        FIRST REVERSE       from 0 to k-1         then reverse from           k to n - 1            now reverse the              whole array
//                EX- arr[4,7,3,6,9,98,5]
//        now first arr[3,7,4]                 then [5,98,9,6]                                                                   = [3,7,4,5,98,9,6]
//        now reversing this whole all together                arr= [6,9,98,5,4,7,3]                                  this is the desired output......


        //   ANOTHER LOGIC
//                EX- arr[4,7,3,6,9,98,5]
// first     reverse the whole array    arr= [5,98,9,6,    3,7,4]
//        now reverse (n-k) elements so index goes from 0 to n-d-1      [6,9,98,5]      and then d ones index goes from n-d to n-1  [4,7,3]          arr= [6,9,98,5,4,7,3]


