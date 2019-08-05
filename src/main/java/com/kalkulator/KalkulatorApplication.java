package com.kalkulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KalkulatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(KalkulatorApplication.class, args);
        Calculator calc = new Calculator();
        System.out.println (calc.subtraction(5.876f, 4.765f));
    }
}
