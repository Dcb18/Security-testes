package br.com.incubadora.original.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityControler {

    @GetMapping("/securityNone")
    public String SemSegredo() {
        return "Não há nenhum segredo aqui ";
    }

    @GetMapping("security")
    public String Segredo() {
        return "Você é muito curioso";
    }

}
