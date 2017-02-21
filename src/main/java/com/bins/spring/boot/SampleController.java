package com.bins.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by songrongbin on 2016/9/28.
 */
@Controller
public class SampleController {
    @ResponseBody
    @RequestMapping(value = "/")
    String home() {
        return "Hello World!";
    }
}
