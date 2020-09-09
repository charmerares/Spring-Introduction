package com.iris.springbootsecurity.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ErrorController {
    public String exception(final Throwable throwable,final Model model){
        System.out.println("Exception during execution of SpringSecurity application");
        String errorMessage = (throwable != null ? throwable.getMessage() : "Unknown error");
        model.addAttribute("errorMessage", errorMessage);

        return "error";
    }
}
