package com.sneha.conditionals;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println(" enter the cost price of the item: ");
        int CP =  input.nextInt();
        System.out.println(" enter the selling  price of the item: ");
        int SP = input.nextInt();
        if(CP > SP)
        {
            int loss = CP -SP;
            System.out.println("the seller  loss of : "+loss);
        }
        else if(SP > CP)
        {
            int profit = SP -CP;
            System.out.println(" the seller incurred profit of "+profit);
        }
        else System.out.println(" the seller incurred no profit no loss.");

    }
}
