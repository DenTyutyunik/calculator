package com.tyutyunik.calculator.service;

import org.springframework.stereotype.Component;

@Component
public class CalculatorServiceImplementation implements CalculatorService {

    @Override
    public String standardAnswer() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String actionSum(double num1, double num2) {
        double result = num1 + num2;
        return String.format("%s + %s = %s", num1, num2, result);
    }

    @Override
    public String actionSubtract(double num1, double num2) {
        double result = num1 - num2;
        return String.format("%s - %s = %s", num1, num2, result);
    }

    @Override
    public String actionMultiply(double num1, double num2) {
        double result = num1 * num2;
        return String.format("%s * %s = %s", num1, num2, result);
    }

    @Override
    public String actionDivide(double num1, double num2) {
        String result;
        if (num1 == 0 || num2 == 0) {
            result = num1 > num2 ? "+infinity" : (num1 < num2 ? "-infinity" : "0");
        } else {
            result = String.valueOf(num1 / num2);
        }
        return String.format("%s / %s = %s", num1, num2, result);
    }
}
