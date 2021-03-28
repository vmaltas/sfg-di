package com.workshop.sfgdi;

import com.workshop.sfgdi.controllers.ConstructorInjectedController;
import com.workshop.sfgdi.controllers.MyController;
import com.workshop.sfgdi.controllers.PropertyInjectedController;
import com.workshop.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.system.SystemProperties;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");
        String greets = myController.sayHello();

        System.out.println(greets);

        System.out.println("---------------Property");

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("---------------Setter");

        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

        System.out.println(setterInjectedController.getGreeting());

        System.out.println("-----------------Constructor");

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

        System.out.println(constructorInjectedController.getGreeting());

    }

}
