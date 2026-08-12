package com.sneha.basics;

public class BODMAS {
    static void main() {
//          / , * , %  >  + , -
        // in arithmetic operator we go left to right
        int x = 4*2/3;         // 8/3  = 2   not    4*0 = 0
        System.out.println(x);      //     2
    }
}
