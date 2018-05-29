package com.suncorp.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * SpringBootApplication class, which is the starting point of Spring boot.
 *
 * ComponentScan - to tell Spring the packages to scan for annotated controllers and services.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.suncorp"})
public class SunCorpAssignmentApplication {

    /**
     * Main method to start the spring application.
     *
     * @param args - args
     */
    public static void main(String[] args) {
        SpringApplication.run(SunCorpAssignmentApplication.class, args);
    }
}
