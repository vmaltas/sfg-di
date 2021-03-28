package com.workshop.sfgdi.controllers;

import com.workshop.sfgdi.services.GreetingService;

/**
 * Created by jt on 12/26/19.
 */
public class SetterInjectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
