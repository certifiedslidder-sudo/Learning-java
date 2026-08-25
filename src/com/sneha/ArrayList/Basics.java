package com.sneha.ArrayList;
import java.lang.reflect.Array;
import java.util.ArrayList;
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
        System.out.println( arr);    // printing arraylist
        for(int i=0;i<arr.size();i++)    // ArrayList has " SIZE() " NOT LENGTH
      {
          System.out.print(arr.get(i) + " " );    // accessing arraylist elements with the helo of loop
      }
        for(int ele : arr)
        {
            System.out.print(ele +" ");
        }
      }
}
