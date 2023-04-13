package com.example.controller;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class mainController {
	
	@GetMapping("/main/{n}")
	public static String format(@PathVariable BigDecimal n) {
        System.out.println("In Controller");
        DecimalFormat formatter = new DecimalFormat("#,##0.00");
        return formatter.format(n);
    }

    @RequestMapping("/hello")
    public String hello()
    {
        return " Hello There";
    }       
   
}
