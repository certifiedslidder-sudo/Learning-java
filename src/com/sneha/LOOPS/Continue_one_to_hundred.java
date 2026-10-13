package com.sneha.LOOPS;

public class Continue_one_to_hundred {
    static void main(String[] args) {
        for (int i =1; i <=20 ; i++) {
            System.out.println(i + " ");
            if(i == 13) continue; // will skip everthing written after continue
            System.out.println("good morning");
        }
    }
}
