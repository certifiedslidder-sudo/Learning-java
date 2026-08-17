package com.sneha.Arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SearchInArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the element you want to search");
        int target = sc.nextInt();
        boolean flag = false;
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
            if (arr[i] == target)
            {
                System.out.println("Element found at index " + i + " ");
                flag = true;
                break;
            }
        }
        if (!flag)
        {
            System.out.println(" Target element is not found ");
        }


    }
}