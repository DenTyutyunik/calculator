package com.tyutyunik.calculator.service;

public interface CalculatorService {
    String standardAnswer();

    String actionSum(double num1, double num2);

    String actionSubtract(double num1, double num2);

    String actionMultiply(double num1, double num2);

    String actionDivide(double num1, double num2);
}
