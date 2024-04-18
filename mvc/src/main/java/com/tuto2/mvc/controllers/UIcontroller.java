package com.tuto2.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/app")
public class UIcontroller {
    @GetMapping()
    public String hola() {
        return "index";
    }

    @GetMapping("/saludo")
    public String Saludo(Model model, @RequestParam String Nombre){
        model.addAttribute("nombre", Nombre);
        return "saludo";
    }
}
