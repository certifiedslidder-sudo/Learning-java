package com.sneha.conditionals;

import java.util.Scanner;

public class Casecheck {
    static void main() {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);    // .trim = remove all the extra spaces that are at the end of these words.

//        String word = "hello";
//        System.out.println(word.charAt(4));   {charAt returns a char type}

        if(ch>='A' && ch<='Z'){
            System.out.println("Uppercase");
        }else{
            System.out.println("lowercase");
        }
        System.out.println(ch);
    }
}
