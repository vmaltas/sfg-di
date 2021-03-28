package com.workshop.sfgdi.controllers;

import com.workshop.sfgdi.services.GreetingService;

/**
 * Created by jt on 12/26/19.
 */
public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
