package com.sneha.basics;

public class DivisionOfDataType {
    static void main() {
        double x = 5/2;     // gives 2.0      ; here we created data type of double so it will store double value
        // java comuted 5/2 as int/ int that gives 2 not 2.5 thus then x which is double stores 2.0 not 2.5
        double y = 5.0/ 2.0;   // gives 2.5    floor/floor = floor
        System.out.println(y);
        System.out.println(x);

//         5/2 = 2                int / int = int
//        int y = 5.0/ 2.0;            ERROR , INCOMPATIBLE DATA TYPE
//       double a =   5/2.0 = 2.0
//        5.0/2.0 = 2.5          floor / floor = floor
//        5.0/ 2 = 2.5           floor/ int = floor
//        5/ 2.0 = 2.5           int / floor = floor
    }
}
