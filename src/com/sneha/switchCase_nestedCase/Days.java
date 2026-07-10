package com.sneha.switchCase_nestedCase;

import java.util.Scanner;

public class Days {
    static void main() {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        switch (day) {
//    case 1 -> System.out.println("monday");
//
//    case 2 -> System.out.println("tuesday");
//    case 3 -> System.out.println("wednesday");
//    case 4 -> System.out.println("thursday");
//    case 5 -> System.out.println("friday");
//    case 6 -> System.out.println("saturday");
//    case 7 -> System.out.println("sunday");

//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("weekdays");
//                break;
//            case 6:
//            case 7:
//                System.out.println("weekends");
//                break;

            case 1, 2, 3, 4, 5 -> System.out.println("weekdays");
            case 6, 7 -> System.out.println("weekends");
        }
    }
}



