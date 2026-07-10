package com.sneha.switchCase_nestedCase;
/*
* duplicate case values are not allowed
* break is used to terminate the statement, if break is not used it will continue to next case
* default will execute when none of the above does, if default is not at end put break after it*/

import java.util.Objects;
import java.util.Scanner;

public class Fruit {
    static void main() {
       Scanner in = new Scanner(System.in);
//        String fruit = in.next();
//
//        if (fruit.equals("mango")) {   /*   .equal only checks value not reference therefor gives true in both the cases, 1- when a and b are pointing towards the same obj
//           // mango  2- if a and b are pointing towards two different object  but of same name . , == gives false for the second case */
//
//            System.out.println("king of fruit");
//             }
//       if (fruit.equals("apple")) {
//           System.out.println("a sweet red  fruit");
//        }
//        switch (fruit) { // this is enhanced switch don't need break
//            case "mango" -> System.out.println("king of fruits");
//            case "apple" -> System.out.println("sweet red fruit");
//            case "orange" -> System.out.println("a tangy fruit");
//            case "berry" -> System.out.println("cute fruit");
//            default -> System.out.println("please enter a valid fruit");

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
