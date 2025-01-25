package com.calculator.contoller;

import com.calculator.model.CalculationResult;
import com.calculator.service.CalculatorService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String greet() {
        return "Добро пожаловать в калькулятор.";
    }

    @GetMapping("/plus")
    @ResponseStatus(HttpStatus.OK)
    public CalculationResult performAddition(@RequestParam double num1, @RequestParam double num2) {
        return new CalculationResult(calculatorService.add(num1, num2));
    }

    @GetMapping("/minus")
    @ResponseStatus(HttpStatus.OK)
    public CalculationResult performSubtraction(@RequestParam double num1, @RequestParam double num2) {
        return new CalculationResult(calculatorService.subtract(num1, num2));
    }

    @GetMapping("/multiply")
    @ResponseStatus(HttpStatus.OK)
    public CalculationResult performMultiplication(@RequestParam double num1, @RequestParam double num2) {
        return new CalculationResult(calculatorService.multiply(num1, num2));
    }

    @GetMapping("/divide")
    @ResponseStatus(HttpStatus.OK)
    public CalculationResult performDivision(@RequestParam double num1, @RequestParam double num2) {
        return new CalculationResult(calculatorService.divide(num1, num2));
    }
}