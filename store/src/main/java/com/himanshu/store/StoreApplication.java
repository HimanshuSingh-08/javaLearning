package com.himanshu.store;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        // Configuration of dotenv-java
        Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();

        // now we have Configuration we just have to load one be one
        dotenv.entries().forEach((entry)-> System.setProperty(entry.getKey(), entry.getValue()));

        SpringApplication.run(StoreApplication.class, args);
    }

}
