package com.sneha.LOOPS;

public class LimitsOfINT {
    static void main(String[] args) {

//   RANGE OF int, -2^31    to 2^31 - 1
//        int x = Integer.MAX_VALUE;
//        System.out.println(x);  //2147483647
//        int y = Integer.MIN_VALUE;
//        System.out.println(y);   //-2147483648

   //     int z = 214748364745; ERROR
   //     System.out.println(z); // will give error as the number is beyond the ranger of int.thi+us we store it on long
//  RANGE OF LONG,   -2^63 to 2^63 -1
        long a = 2147483644534636L;
        System.out.println(a);

        long c = Long.MAX_VALUE;
        System.out.println(c); //9223372036854775807
    }
}
