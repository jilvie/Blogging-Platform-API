package com.blogging.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
    @RequestMapping("")
    public String simpleParam(String name,Integer age)
    {
        System.out.println("name"+name+",age"+age);
        return "ok";
    }
}
