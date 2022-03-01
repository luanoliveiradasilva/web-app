package com.example.webapp.controller;


import com.example.webapp.model.Pessoa;
import com.example.webapp.usecases.Pessoas.PessoaUseCases;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cadastro/v1")
public class PessoasController {

    @Autowired
    PessoaUseCases pessoasUseCases;

    @ResponseBody
    @GetMapping("/formulario")
    public List<Pessoa> getPessoas() {
        return pessoasUseCases.findAll();
    }

    @ResponseBody
    @PostMapping("/cadastro")
    public Pessoa postPessoas(@RequestBody Pessoa pessoa) {
        return pessoasUseCases.postAll(pessoa);
    }

}
