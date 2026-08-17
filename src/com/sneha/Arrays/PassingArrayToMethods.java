package com.sneha.Arrays;

public class PassingArrayToMethods {
    public static void main(String[] args){
        int[] x = { 10, 20 ,234, 56};
        change(x);
        System.out.println(x[2]);
  // whenever we pass our array to a method it is passed by reference.
    }
    public static void change(int[] y){
        y[2]= 34 ;
        // here  x and y are reference variables that points at the array.
        // i passed the same array to y that i passed to x.
    }
}