package com.rabobank.resume.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/fizzbuzz")

public class FizzBuzzController {
    @GetMapping("/{number}")
    public String index(@PathVariable int number) {
        String result = "";
        if (number % 3 == 0) {
            result += "Fizz";
        }
        if (number % 5 == 0) {
            result += "Buzz";
        }
        if (number % 3 != 0 && number % 5 != 0) {
            result += number;
        }
        return result;
    }
}
