package com.calculator.service;

@org.springframework.stereotype.Service
public class CalculatorService {

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Деление на ноль невозможно.");
        }
        return num1 / num2;
    }
}