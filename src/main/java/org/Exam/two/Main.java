package org.Exam.two;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        for (int i = n-1; i >= 0; i--) {
            int k = n;
            for (int j = k; j <m; j++) {
                System.out.print(" ");
            }
            for (int j = k; j > 0; j--) {
                System.out.print(k);
                System.out.print(" ");
                k--;
            }
            n--;
            System.out.println();
        }
    }
}