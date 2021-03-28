package com.workshop.sfgdi.controllers;

import com.workshop.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by jt on 12/26/19.
 */
@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("propertyInjectionGreetingService")
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
