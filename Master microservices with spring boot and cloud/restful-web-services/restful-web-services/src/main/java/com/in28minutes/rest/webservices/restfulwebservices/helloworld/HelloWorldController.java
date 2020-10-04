package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import com.in28minutes.rest.webservices.restfulwebservices.helloworld.HelloWorldBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
public class HelloWorldController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping(path="/hello-world")
    public String helloWorld(){
        return "Hello world";
    }

    @GetMapping(path="/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }

    @GetMapping(path="/hello-world-bean/path-variable/{name}")
    public HelloWorldBean HelloWorldBeanPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World %s", name));
    }

    @GetMapping(path="/hello-world-bean-internationalized")
    //To request a specifc header from http request
    //Use AcceptHeaderLocaleResolver to not write the arguments everytime
    public String HelloWorldBeanInternationalized(/*@RequestHeader(name="Accept-Language", required = false) Locale locale*/){
        //finds the message from the properties file
        return messageSource.getMessage("good.morning.message",null, LocaleContextHolder.getLocale());
    }
}
