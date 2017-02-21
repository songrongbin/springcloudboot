package com.bins.spring.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by songrongbin on 2016/9/29.
 */
public class MyApplicationFailedEventListener implements ApplicationListener<ApplicationFailedEvent> {
    private Logger logger = LoggerFactory.getLogger(MyApplicationFailedEventListener.class);

    @Override
    public void onApplicationEvent(ApplicationFailedEvent event) {
        Throwable throwable = event.getException();
        handleThrowable(throwable);
    }

    /*处理异常*/
    private void handleThrowable(Throwable throwable) {
        logger.info("==MyApplicationFailedEventListener==");
    }
}
