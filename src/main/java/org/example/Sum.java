package org.example;

public class Sum {
    public int execute(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            int carry = num1 & num2;
            return execute(num1 ^ num2, carry << 1);
        }
    }
}
