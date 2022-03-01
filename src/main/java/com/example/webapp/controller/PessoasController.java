package com.example.webapp.controller;


import com.example.webapp.model.Pessoa;
import com.example.webapp.usecases.PessoaUseCases;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping()
public class PessoasController {

    @Autowired
    PessoaUseCases pessoasUseCases;

    @ResponseBody
    @GetMapping("/")
    public List<Pessoa> getPessoas() {
        return pessoasUseCases.pegarTodasAsPessoas();
    }

}
