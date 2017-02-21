package com.bins.spring;

import com.bins.spring.event.MyApplicationStartedEventListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by songrongbin on 2016/9/29.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication app = new SpringApplication(Application.class);
        app.addListeners(new MyApplicationStartedEventListener());
        app.run("--server.port=8080");
        // SpringApplication.run(Application.class, "--server.port=8080");
    }
}
