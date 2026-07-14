package com.sneha.functions;

public class PassingExample {
    static void main() {
        String ironman = "suhana rawat";
        greet(ironman);

    }

    static void greet(String naam) {  /* value of reference variable is passed (ironman, naam) both  points towards same object "suhana rawat"*/
        System.out.println(naam);
    }
}
