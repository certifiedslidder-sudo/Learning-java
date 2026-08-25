package com.sneha.ArrayList;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class Basics {
    //arraylist = dynamic arrays  can be c/a growing array.
   // arrays = fixed sized hence no delay in element retrieval.
    static void main() {
        ArrayList<Integer> arr = new ArrayList<>(); // by default capacity : 10
        arr.add(7);
        arr.add(23);
        arr.add(38);
        arr.add(2);
        arr.add(5);
        System.out.println(arr.get(2));  // to access element we use get    ex , arr[2]
       // arr[4] = 34;    we cant modify value like this

        arr.set(3,50);      //  modified arr[3]= 50

        //  System.out.println(arr);    // printing arraylist , here the arraylist isn't traversed by us.
        int n = arr.size();
//        for(int i=0;i<arr.size();i++)    // ArrayList has " SIZE() " NOT LENGTH
//      {
//          System.out.print(arr.get(i) + " " );    // accessing arraylist elements with the helo of loop
//      }
//        for(int ele : arr)
//        {
//            System.out.println(ele +" ");
//        }
        //  7 23 38 50 5

        arr.add(78);       // will add 78 at last

       // System.out.println(arr);             //[7, 23, 38, 50, 5, 78]

        arr.add(0,90);   // eill add 90 at arrr[0] and will increase the index of arr by 1.

        // System.out.println(arr);               // [90, 7, 23, 38, 50, 5, 78]


        arr.set(2,77);       // will replace the previous element on index 2 to 77 here, 23 replaced by 77
        System.out.println(arr);   // [90, 7, 77, 38, 50, 5, 78]

       // arr.remove(n -1); // here we gave n the size of array , then we increased the size of array thus this will give wrong output.
       arr.remove(arr.size()-1);
        System.out.println(arr);       // [90, 7,77, 38, 50, 5]

        Collections.reverse(arr);
        System.out.println(arr);       //[5, 50, 38, 77, 7, 90]


      }
}
