package br.com.incubadora.original.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @RequestMapping("/home")
    public String hello() {
        return "Hello buddy!";
    }

    @RequestMapping("/users")
    @ResponseBody
    public String getUsers() {
        return "{\"users\":[{\"name\":\"Lucas\", \"country\":\"Brazil\"}," +
                "{\"name\":\"Jackie\",\"country\":\"China\"}]}";
    }
}
