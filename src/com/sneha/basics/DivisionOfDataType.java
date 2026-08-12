package com.sneha.basics;

public class DivisionOfDataType {
    static void main() {
        double x = 5/2;     // gives 2.0
        // java comuted 5/2 as int/ int that gives 2 not 2.5 thus then x which is double stores 2.0 not 2.5
        double y = 5.0/ 2.0;   // gives 2.5    floor/floor = floor
        System.out.println(y);
        System.out.println(x);

//        5/2 = 2
//        5.0/2.0 = 2.5
//        5.0/ 2 = 2.5
//        5/ 2.0 = 2.5
    }
}
