package com.ioc.loose.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCExample {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.loose.coupling.xml");
        UserManager userManager = (UserManager) context.getBean("looseCoupling");
        System.out.println(userManager.getUserInfo());

        UserManager userManager2 = (UserManager) context.getBean("looseCoupling2");
        System.out.println(userManager2.getUserInfo());
    }
}
