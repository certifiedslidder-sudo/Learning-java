package com.sneha.LOOPS;
//    print numbers from one to five

public class Loops {
    static void main() {
        /*
        SYNTAX OF FOR LOOPS:

        for(initialization; condition ; increment/decrement) {
            //body
           }

         */
    for(int num =1;num<=5;num++){
        System.out.println(num);

    }
    }

    public static class Repeating_number {
        static void main() {
            int n = 52325955;
            int count =0;
            while(n>0){
                int rem = n%10;
                if(rem ==5){
                    count++;
                }
                n /= 10;
            }
            System.out.println(count);
        }
    }
}
