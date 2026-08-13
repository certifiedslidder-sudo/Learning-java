package com.sneha.conditionals;
 // take positive integer input and tell if odd or even
import java.util.Scanner;

public class OddOrEven
{
    static void main()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = input.nextInt();
        if(n%2 ==0)
        {         // remember 1%2 = 1 therefore odd
            System.out.println("the number is even");
        }
        else
            {
                System.out.println("the number is  odd");
            }



    }
}
