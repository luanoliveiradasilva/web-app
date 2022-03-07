package com.example.webapp.controller;


import com.example.webapp.model.Pessoa;
import com.example.webapp.usecases.Pessoas.PessoaUseCases;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cadastro/v1")
public class PessoasController {
    @Autowired
    PessoaUseCases pessoasUseCases;

    @ResponseBody
    @GetMapping(value = "/formulario")
    public List<Pessoa> getPessoas() {
        return pessoasUseCases.findAll();
    }

    @ResponseBody
    @PostMapping(value = "/cadastros")
    public ResponseEntity<Pessoa> postPessoas(
            @RequestBody Pessoa pessoa) {
        var pessoaUse = pessoasUseCases.postAll(pessoa);
        return new ResponseEntity(HttpStatus.OK);
    }
}
