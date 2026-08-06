package com.sneha.basics;

public class ArithmeticOperations {
    static void main() {
        //int x = 39 , y = 10;
        double  x = 39 , y = 10;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);   // here int/ int gives int so the decimal part is removed. from 3.9
           //  NOTE === DECIMAL PART GETS REMOVED ,, NO ROUND OFF HERE IN JAVA , so use double to declare your variable
    }
}
