package com.restaurant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class RestaurantApplication {
    private static Logger log = LoggerFactory.getLogger(RestaurantApplication.class);

    public static void main(String[] args) {
        log.info("E-Restaurant application started");

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        log.info("Bean context is up");

    }

}
