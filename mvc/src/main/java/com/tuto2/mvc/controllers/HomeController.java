package com.tuto2.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tuto2.mvc.model.Persona;

@Controller
@RequestMapping("/api")
public class HomeController {

    @GetMapping()
    public String hola() {
        return "index";
    }

    @GetMapping("/nombre")
    public Persona ObtenerPersona(){
        Persona p = new Persona("JChavagg");
        return p;
    }

}