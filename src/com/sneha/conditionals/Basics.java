package com.sneha.conditionals;

public class Basics {
    static void main() {
        /*
        syntax of if statement:
        if(boolean expression T or F){
        //body
        } else{
        //do this
        }
         */
    int salary = 2400;
//    if(salary> 10000){
//        salary = salary +2000;
//    }else{
//        salary = salary + 1000;
//    }
//        System.out.println(salary);
//    }


        // MULTIPLE IF - ELSE
  if(salary > 20000){
      salary += 2000;
  } else if( salary > 10000){
      salary+= 30000;
  } else{ // only executes if none of the above condition is true.
      salary+= 4000;
  }

    }


}
