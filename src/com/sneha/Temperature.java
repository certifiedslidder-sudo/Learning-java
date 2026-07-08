package com.sneha;

import java.util.Scanner;

public class Temperature {
    static void main() {
        Scanner in =  new Scanner(System.in);
        System.out.println("please enter temperature in celcius");
        float tempC = in.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println("temperature in fahrenheit =" + tempF);
    }
}
