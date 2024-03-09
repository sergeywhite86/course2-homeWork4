package com.white.course2homework4.controllers;

import com.white.course2homework4.services.CalculatorServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorServiceImpl service;

    public CalculatorController(CalculatorServiceImpl service) {
        this.service = service;
    }

    @GetMapping()
    public String welcome() {
        return service.welcome();
    }

    @GetMapping("/plus")
    public String addition(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        return service.addition(num1, num2);
    }

    @GetMapping("/minus")
    public String subtraction(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        return service.subtraction(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiplication(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        return service.multiplication(num1, num2);
    }

    @GetMapping("/divide")
    public String division(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        return service.division(num1, num2);
    }
}
