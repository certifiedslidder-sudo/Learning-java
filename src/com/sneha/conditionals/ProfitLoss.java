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
            System.out.println("the seller  incurred loss of : " + (CP-SP));
            float loss_percantage = (CP-SP/CP)*100;
            System.out.println("the LOSS percentage is "+loss_percantage+'%');
        }
        else if(SP > CP)
        {
            System.out.println(" the seller incurred profit of " + (SP-CP));
            float profit_percantage = (SP-CP/CP)*100;
            System.out.println("the profit percentage is "+profit_percantage+'%');
        }
        else{
            System.out.println(" the seller incurred no profit no loss.");
        }

    }
}
// An if ladder evaluates multiple conditions sequentially without an else, while an if-else ladder executes the first true condition and optionally runs a final else block if none are true.