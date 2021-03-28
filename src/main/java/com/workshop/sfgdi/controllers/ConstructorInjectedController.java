package com.workshop.sfgdi.controllers;

import com.workshop.sfgdi.services.GreetingService;

/**
 * Created by jt on 12/26/19.
 */
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
