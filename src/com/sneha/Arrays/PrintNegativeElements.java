package com.sneha.Arrays;
import javax.swing.undo.UndoableEdit;
import java.util.Scanner;
public class PrintNegativeElements {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("enter array size: ");
        int n = input.nextInt();
        int[] sneha = new int[n];
        System.out.print("enter array elements: ");
        for (int i = 0; i < n; i++)
            sneha[i] = input.nextInt();
        System.out.print("Negative elements are:");
        for (int i = 0; i < n; i++)
            if (sneha[i] < 0)
            {
        System.out.print(sneha[i]);
            }
    }
}

