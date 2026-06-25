package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    private static final Logger logger =
            LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {

        String username = "Nohitha";
        int age = 21;

        logger.info("User Name : {}", username);
        logger.info("Age : {}", age);

        logger.debug("User {} logged in successfully.", username);

        logger.warn("User {} attempted invalid login {} times.",
                username, 3);

        logger.error("Error while processing user {}.", username);
    }
}