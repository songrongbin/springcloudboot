package com.bins.spring.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by songrongbin on 2016/9/29.
 */
public class MyApplicationStartedEventListener implements ApplicationListener<ApplicationStartedEvent> {
    private Logger logger = LoggerFactory.getLogger(MyApplicationStartedEventListener.class);

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        SpringApplication app = event.getSpringApplication();
        app.setBannerMode(Banner.Mode.CONSOLE);
        logger.info("==MyApplicationStartedEventListener==");
    }
}
