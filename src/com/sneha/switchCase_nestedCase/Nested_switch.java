package com.sneha.switchCase_nestedCase;

import java.util.Scanner;

public class Nested_switch {
    static void main() {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();
//
//        switch(empID) {
//            case 1:
//                System.out.println("sneha rawat");
//                break;
//            case 2:
//                System.out.println("suhana rawat");
//                break;
//            case 3:
//                System.out.println(" emp number 3");
//                switch(department) {
//                    case "IT" :
//                        System.out.println("IT department");
//                        break;
//                    case "Management":
//                        System.out.println("Management department");
//                        break;
//                    default:
//                        System.out.println("No department entered");
//
//                }break;
//            default:
//                  System.out.println("enter correct employee ID");
//        }


        switch (empID) {
            case 1 -> System.out.println("sneha rawat");
            case 2 -> System.out.println("suhana rawat");
            case 3 -> {
                System.out.println(" emp number 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("No department entered");

                }
            }
            default -> System.out.println("enter correct employee ID");
        }


    }
}
