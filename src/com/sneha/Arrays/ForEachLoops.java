package com.sneha.Arrays;
public class ForEachLoops {
    static void main() {
        // FOR EACH LOOP --> Specifically used to traverse data structures like array , hash - maps etc.
        // you cannot modify array elements using for each loops.
         int[] arr = {4,68,7,6,9};
//         for(int i =0;i< arr.length; i++){
//             System.out.println(arr[i]+" ");
            for(int ele: arr){ // here ele is made as copy of array elements.
               System.out.print(ele +" ");
           }

         }
    }

