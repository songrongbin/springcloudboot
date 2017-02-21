package com.bins.spring.boot;

import com.bins.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by songrongbin on 2016/9/29.
 */
@RestController
@RequestMapping("/springboot")
public class HelloWorldController {
    @Autowired
    private User user;

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String sayWorld(@PathVariable("name") String name) {
        System.out.println("userName:" + user.getName());
        return "Hello " + name;
    }

}