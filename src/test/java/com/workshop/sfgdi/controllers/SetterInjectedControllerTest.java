package com.workshop.sfgdi.controllers;

import com.workshop.sfgdi.services.PropertyInjectionGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new PropertyInjectionGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());

    }
}