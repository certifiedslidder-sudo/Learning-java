package com.sneha.functions;

public class Swap {
    static void main() {
        int a=10;
        int b = 20;

        // swaping two numbers
//        int temp = a;
//        a = b;
//        b = temp;
        swap(a,b);
        System.out.println(a+" " + b);

        String naam = "sneha rawat";    // strings cannot be modified
        changeName(naam);  // HERE WE CREATED A NEW OBJECT NAME IS NOW POINTING TO SNEHA RAWAT , BUT IT DIDN'T CHANGE WHAT THE ORIGINAL NAME WAS POINTING TO{suhana rawat}
        System.out.println(naam); // prints sneha rawat
    }

    private static void changeName(String name) {
        name = "suhana rawat";

    }

    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;

    }
}
