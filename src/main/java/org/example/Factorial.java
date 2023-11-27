package org.example;

public class Factorial {
    public int recursionExecute(int value){
        if (value == 0){
            return 1;
        }
        else
        if (value >= 1){
            return value * recursionExecute(value -1);
        }
        else return -1;
    }

    public int cycleExecute(int value) {
        if (value < 0) {
            return -1;
        }
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }
}
