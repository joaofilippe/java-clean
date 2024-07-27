package com.joaofilippe.services_app.adapters.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    final private String route = "/welcome";
    @GetMapping(route + "/ping")
    public String welcome(){
        return "Welcome to UAppS";
    }
}
