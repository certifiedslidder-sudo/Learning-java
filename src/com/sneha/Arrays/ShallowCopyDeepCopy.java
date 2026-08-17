package com.sneha.Arrays;
import java.util.Arrays;
public class ShallowCopyDeepCopy {
    public static void main(String[] args){
        int[] arr = {10,20,30,40};
   //     int[] x = arr;      // x is the shallow copy of arr , that means no actual copy is made , we just accessed the array by another name.
   //     x[0] = 100;
        int[] p = Arrays.copyOf(arr,arr.length);      // deep copy
        p[0] = 1232;
        System.out.println(p[0]);
        System.out.println(arr[0]); // no change here
    }
}
