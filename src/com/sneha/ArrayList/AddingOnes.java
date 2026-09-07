package com.sneha.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;
public  class AddingOnes {
      static class Solution {
          // Function for adding one to the number represented by the array
          static Vector<Integer> addOne(int[] arr) {
              Vector<Integer> ans = new Vector<>();
              int z = arr.length;
              int carry = 1;
              for (int i = z - 1; i >= 0; i--) {
                  if (arr[i] + carry <= 9) {
                      ans.add(arr[i] + carry);
                      carry = 0;
                  } else {
                      ans.add(0);
                      carry = 1;
                  }
              }
              if (carry == 1) ans.add(1);        // for 99 or 999
              Collections.reverse(ans);
              return ans;
          }
      }
          static void main() {
              Scanner sc = new Scanner(System.in);
              System.out.println("enter the size of array");
              int n = sc.nextInt();
              int[] arr = new int[n];
              System.out.println("enter the array list");
              for(int i =0; i<n;i++){
                  arr[i] = sc.nextInt();
              }
              Vector<Integer> result = Solution.addOne(arr);

              System.out.println("result: "+result);
          }
        }


