package com.example.autowire.type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
//    psvm - public static void main

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowireByType.xml");
        Car carr = (Car) context.getBean("car");
        carr.displayDetails();
    }
}
