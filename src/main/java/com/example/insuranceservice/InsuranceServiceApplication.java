package com.example.insuranceservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
@RestController
@RequestMapping("/insurance")
public class InsuranceServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InsuranceServiceApplication.class, args);
    }


    @GetMapping(value = "/getUpdatedPlans")
    public List<String> getAllPlans() {

        return Stream.of("Amica",
                "Geico",
                "State Farm",
                "Progressive",
                "New Launch 001",
                "New Launch 002").collect(Collectors.toList());

    }


}
