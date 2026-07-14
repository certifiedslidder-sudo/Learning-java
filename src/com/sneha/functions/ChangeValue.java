package com.sneha.functions;

import java.util.Arrays;

public class ChangeValue {
    static void main() {
        // create an array
        int[] arr = {1, 3, 2, 45, 6};
        change(arr);
        System.out.println(Arrays.toString(arr));    //prints [99, 3, 2, 45, 6]

    }

    static void change(int[] nums){
        nums[0] = 99; // will make changes to arr, as it still points to same object
                     // if you make a change to the object via this ref. variable , same object will be changed
    }
}
