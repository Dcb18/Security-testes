package br.com.incubadora.original.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/private")
    public String validacao() {
        return "Validado";
    }
}
