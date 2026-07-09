package com.sneha.conditionals;

public class Repeating_number {
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
