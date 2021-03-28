package com.workshop.sfgdi.controllers;

import com.workshop.sfgdi.services.PropertyInjectionGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();

        controller.greetingService = new PropertyInjectionGreetingService();
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}