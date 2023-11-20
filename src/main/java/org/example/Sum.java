package org.example;

public class Sum {
    public int execute(int num1, int num2){
        while (num2 != 0) { // num1 = 4 num2 = 8
            int carry = num1 & num2; // 0100 & 1000 = 0000
            num1 = num1 ^ num2; // = 1100
            num2 = carry << 1; // = 0000
        }
        return num1;
    }
}
