package com.white.course2homework4.services;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public int addition(Integer val1, Integer val2) {
        validation(val1, val2);
       return  val1 + val2;
    }

    @Override
    public int subtraction(Integer val1, Integer val2) {
        validation(val1, val2);
        return val1 - val2;
    }

    @Override
    public int multiplication(Integer val1, Integer val2) {
        validation(val1, val2);
        return val1 * val2;
    }

    @Override
    public double division(Integer val1, Integer val2) {
        validation(val1, val2);
        if (val2 == 0) throw new ArithmeticException("Делить на ноль нельзя");
        return  (double) val1 / val2;
    }
    private void validation(Integer val1, Integer val2) {
        if (val1 == null || val2 == null) throw new IllegalArgumentException("Введены не все числа");
    }
}
