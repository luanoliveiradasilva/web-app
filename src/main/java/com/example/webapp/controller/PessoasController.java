package com.example.webapp.controller;


import com.example.webapp.model.Pessoa;
import com.example.webapp.usecases.Pessoas.PessoaUseCases;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cadastro/v1")
public class PessoasController {

    private final PessoaUseCases pessoasUseCases;

    @Autowired
    public PessoasController(PessoaUseCases pessoasUseCases){
        this.pessoasUseCases = pessoasUseCases;
    }

    @ResponseBody
    @GetMapping(value = "/formulario")
    public ResponseEntity<List<Pessoa>> getPessoas() {
        var pessoa = pessoasUseCases.findAll();
        return ResponseEntity.ok().body(pessoa);
    }

    @ResponseBody
    @PostMapping(value = "/cadastros")
    public ResponseEntity<Pessoa> postPessoas(
            @RequestBody Pessoa pessoa) {
        var pessoaUse = pessoasUseCases.postAll(pessoa);
        return ResponseEntity.ok().body(pessoaUse);
    }
}
