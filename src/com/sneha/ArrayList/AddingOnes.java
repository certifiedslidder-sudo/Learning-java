package com.sneha.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;
public class AddingOnes {
    static void main() {
        class Solution {
            // Function for adding one to the number represented by the array
            Vector<Integer> addOne(int[] arr) {
                Vector<Integer> ans = new Vector<>();
                Scanner sc = new Scanner(System.in);
                System.out.println("enter the size of array");
                int n = sc.nextInt();
                System.out.println("enter the array list");
                int x = sc.nextInt();
               // int n = arr.length;
                int carry =1;
                for(int i = n-1; i>=0; i--){
                    if(arr[i] + carry <=9)
                    {
                        ans.add(arr[i]+carry);
                        carry =0;
                    }
                    else
                    {
                        ans.add(0);
                        carry =1;
                    }
                }
                if(carry == 1) ans.add(1);        // for 99 or 999
                Collections.reverse(ans);
                return ans;
            }
        }
    }
}
