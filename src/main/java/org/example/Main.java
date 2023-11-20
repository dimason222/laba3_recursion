package org.example;

public class Main  {




    public static void main(String[] args) {
        Sum sum = new Sum();
        Digits digits = new Digits();
        Factorial fact = new Factorial();
        Fibonacci fibonacci = new Fibonacci();
        int a1 = fact.recursionExecute(5);
        int b1 = fact.cycleExecute(5);
        int a2 = fibonacci.recursionExecute(5);
        int b2 = fibonacci.cycleExecute(5);
        assert a1 == b1 : "different values";
        assert a2 == b2 : "different values";
        System.out.println("input value:" + 5);
        System.out.println("Fibonacci recursion:" + a1);
        System.out.println("Fibonacci recursion:" + b1);
        System.out.println("input value:" + 5);
        System.out.println("Factorial recursion:" + a2);
        System.out.println("Factorial recursion:" + b2);

        System.out.println("Sum without '+', values are 4 and 8:" + sum.execute(4,8));
        System.out.println("Sum of digits, value is 145" + digits.execute(145));
    }
}