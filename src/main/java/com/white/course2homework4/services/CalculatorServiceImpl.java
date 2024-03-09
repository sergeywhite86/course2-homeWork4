package com.white.course2homework4.services;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String addition(Integer val1, Integer val2) {
        int result = val1 + val2;
        return String.format("%d + %d = %d", val1, val2, result);
    }

    @Override
    public String subtraction(Integer val1, Integer val2) {
        int result = val1 - val2;
        return String.format("%d - %d = %d",val1,val2,result);
    }

    @Override
    public String multiplication(Integer val1, Integer val2) {
        int result = val1 * val2;
        return String.format("%d * %d = %d",val1,val2,result);
    }

    @Override
    public String division(Integer val1, Integer val2) {
        if(val2 == 0) throw new ArithmeticException("Делить на ноль нельзя");
        double result = (double) val1 / val2;
        return String.format("%d / %d = %.2f",val1,val2,result);
    }
}
