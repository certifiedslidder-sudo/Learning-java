package com.sneha.basics;

public class IncrementDecrement {
    static void main() {
        int x = 10;
        // x--;
        System.out.println(x++);      //      10    { POST+ INCREMENT } first use the current value then increment it.
        System.out.println(x);        //      11
        //System.out.println(++x);      //      11         { pre increment}    this increment the value and uses it.
        //System.out.println(x);        //      11

       // System.out.println(x--);      //      10    { POST DECREMENT } first use the current value then decrement it.
       // System.out.println(x);        //      9
       // System.out.println(--x);        //      9      { pre decrement}      this decrements the value and uses it.
       // System.out.println(x);          //      9
    }
}
