package com.sneha.functions;

public class ReturnTYPE2 {
    static int asus(int a){
        System.out.println("sneha");
        if(a>0) return 5;
        return 8;
        // System.out.println("fruit");  gives error as return ends the function.
    }
    static void main(String[] args) {
        int x = asus(7);
        System.out.println(3+x);
    }
}