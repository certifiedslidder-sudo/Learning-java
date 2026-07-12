package com.sneha.functions;

import java.util.Scanner;

public class Argument_strings {
    static void main() {
        //String message = greet();
        //System.out.println(message);


        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a string");
        String name = in.nextLine();
        String personalised = myGreet(name);
        System.out.println(personalised);
    }
    static String myGreet(String name){
        String message = "hello " + name;
        return message;
    }

     static String greet(){
        String greeting = "how are you";
        return greeting;
    }
}
