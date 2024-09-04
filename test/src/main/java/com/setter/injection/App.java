package com.setter.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
//    psvm - public static void main

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationSetterInjection.xml");
        Animal myPet = (Animal) context.getBean("myPet");
        myPet.displayDetails();
    }
}
