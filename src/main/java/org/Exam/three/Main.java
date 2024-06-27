package org.Exam.three;


class Main {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i < n; i++) {
            if (i == 1) {
                System.out.print(0+" ");
            }
            System.out.print(f(i)+" ");
        }
    }
    public static int f(int n) {
        if (n <= 1) {
            return n;
        } else {
            return f(n - 2) + f(n - 1);
        }
    }
}