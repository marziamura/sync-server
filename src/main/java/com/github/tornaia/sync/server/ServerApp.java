package com.github.tornaia.sync.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.github.tornaia.sync.server")
public class ServerApp {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ServerApp.class, args);
    }
}