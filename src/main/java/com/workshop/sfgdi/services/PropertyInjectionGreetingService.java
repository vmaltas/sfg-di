package com.workshop.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/26/19.
 */
@Service
public class PropertyInjectionGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World-Property";
    }
}
