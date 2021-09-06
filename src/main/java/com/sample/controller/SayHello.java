package com.sample.controller;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/hello")
public class SayHello {
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String hello(@PathVariable String name) {
        String result="Hello "+name;
        return result;
    }
}