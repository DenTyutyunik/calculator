package com.tyutyunik.calculator.controller;

import com.tyutyunik.calculator.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    //@Autowired // for resolve and inject multiple controllers
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("")
    public String standardAnswer() {
        return calculatorService.standardAnswer();
    }

    @GetMapping("/plus")
    public String actionSum(@RequestParam Optional<Double> num1,
                            @RequestParam Optional<Double> num2) {
        if (num1.isPresent() && num2.isPresent()) {
            return calculatorService.actionSum(num1.get(), num2.get());
        } else {
            return "Нет одного из параметров";
        }
    }

    @GetMapping("/minus")
    public String actionSubtract(@RequestParam Optional<Double> num1,
                                 @RequestParam Optional<Double> num2) {
        if (num1.isPresent() && num2.isPresent()) {
            return calculatorService.actionSubtract(num1.get(), num2.get());
        } else {
            return "Нет одного из параметров";
        }
    }

    @GetMapping("/multiply")
    public String actionMultiply(@RequestParam Optional<Double> num1,
                                 @RequestParam Optional<Double> num2) {
        if (num1.isPresent() && num2.isPresent()) {
            return calculatorService.actionMultiply(num1.get(), num2.get());
        } else {
            return "Нет одного из параметров";
        }
    }

    @GetMapping("/divide")
    public String actionDivide(@RequestParam Optional<Double> num1,
                               @RequestParam Optional<Double> num2) {
        if (num1.isPresent() && num2.isPresent()) {
            return calculatorService.actionDivide(num1.get(), num2.get());
        } else {
            return "Нет одного из параметров";
        }
    }
}
