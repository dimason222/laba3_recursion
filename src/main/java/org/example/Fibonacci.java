package org.example;

public class Fibonacci {
    public int recursionExecute(int n) {
        if (n <= 1) {
            return n;
        } else {
            return recursionExecute(n - 1) + recursionExecute(n - 2);
        }
    }

    public int cycleExecute(int n){
        if (n < 0){
            return -1;
        }
        if (n == 1 || n == 0) {
            return n;
        }
        int num1 = 0;
        int num2 = 1;
        for (int i = 2; i <= n; i++) {
            int c = num1 + num2;
            num1 = num2;
            num2 = c;
        }
        return num2;
    }
}
