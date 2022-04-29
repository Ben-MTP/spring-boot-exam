package com.core.manhkm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Interface CommandLineRunner
 *      Một functionInterface.
 */
@SpringBootApplication
@EnableConfigurationProperties
public class SpringBoot16ConfigurationPropertiesApplication implements CommandLineRunner {

    @Autowired
    LodaAppProperties lodaAppProperties;

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot16ConfigurationPropertiesApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Global variable: ");
        System.out.println("\t Email: " + lodaAppProperties.getEmail());
        System.out.println("\t GA-ID: " + lodaAppProperties.getGoogleAnalyticsId());
        System.out.println("\t Authors: " + lodaAppProperties.getAuthors());
        System.out.println("\t Example Map: " + lodaAppProperties.getExampleMap());
        System.out.println("\t Person List: " + lodaAppProperties.getPersonList());
    }
}
