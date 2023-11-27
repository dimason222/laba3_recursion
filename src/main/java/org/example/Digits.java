package org.example;

public class Digits {
    public int execute(int value){
        if (value == 0) {
            return 0;
        } else {
            return value % 10 + execute(value / 10);
        }
    }
}
