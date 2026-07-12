package com.sneha.functions;

public class Return_string {
    static void main() {
        String message = greet(); // jumps to greet()
        System.out.println(message);  // printing value of message- "how are you"
    }
        static String greet() {
        String greeting = "how are you dear";   // how are you dear -will be stored in greet as message
        //greeting = "how are you";
        return greeting;
        }

}
