package com.sneha.LOOPS;

public class AllEven {
    static void main() {
        for(int i=1;i<=100;i++){
            if(i%2== 0) System.out.println(i);
        }

    }
}


   // ALTERNATE ----> you can also do


//    for( int i =2; i<=100;i+=2){        // if you want to initialize by 1 just add a if condition for even before printing i .
//       System.out.println(i+" ");
//                            }

// here the code runs only 550 times as there are 50 even no. from 1 to 100 thus it reduced the no. of iterations by half .