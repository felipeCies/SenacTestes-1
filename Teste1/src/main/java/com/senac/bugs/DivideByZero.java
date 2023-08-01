package com.senac.bugs;

public class DivideByZero {

    public static void main(String[] args) {
        int number = 10;
        int divisor = 0;
        if (divisor != 0) {
            int result = number / divisor;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Impossível dividir por zero, o resultado sempre será zero");
        }
    }
}
