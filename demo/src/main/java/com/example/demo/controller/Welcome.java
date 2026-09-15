package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Welcome {

    @RequestMapping("/")
    public  String mensangem(){
        return "Bem vindo";
    }
    @RequestMapping("/dev")
    public  String dev(){
        return "Feito por: Nilton Sacramento";
    }
    @RequestMapping("/turma")
    public  String turma() {
        return "Turma:99160";
    }

    @RequestMapping("/curso")
    public  String curso() {
        return "Desenvolvimento de sistema";
    }
}
