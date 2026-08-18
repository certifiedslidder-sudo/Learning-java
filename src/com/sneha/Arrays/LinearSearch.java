package com.sneha.Arrays;

public class LinearSearch {
    static void main() {

        int[] arr = { 123,16,8,84,324,67,8,4};
        int target =16;
        int found = -1;   // -1 meeans target is not from array
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == target){
                found = i;   // any number except -1 means target array se hai.
                break;
            }
        }
        if(found!= -1) System.out.println("Target exist in array at index : " + found);
        else   System.out.println("Target do not exist in array");
    }
}
