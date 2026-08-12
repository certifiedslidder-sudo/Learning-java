package com.sneha.basics;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class SimpleInterest {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println(" enter the princple amount");
        double principle = input.nextDouble();
        System.out.println("enter the rate");
        double rate = input.nextDouble();
        System.out.println("enter the time ");
        double time = input.nextDouble();
        double SI = (principle * rate * time)/ 100;
        double  TotalAmount = principle + SI;
        System.out.println("The interest is : " + SI);
        System.out.println("the total amount is : " + TotalAmount);

    }
}
