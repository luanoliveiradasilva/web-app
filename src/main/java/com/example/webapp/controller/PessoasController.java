package com.example.webapp.controller;


import com.example.webapp.model.Pessoa;
import com.example.webapp.usecases.Pessoas.PessoaUseCases;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/cadastro/v1")
public class PessoasController {

    private final PessoaUseCases pessoasUseCases;

    @Autowired
    public PessoasController(PessoaUseCases pessoasUseCases) {
        this.pessoasUseCases = pessoasUseCases;
    }

    @CrossOrigin
    @GetMapping(value = "/formulario")
    public ResponseEntity getPessoas() {
        try {
            var pessoa = pessoasUseCases.findAll();
            return new ResponseEntity<>(pessoa, HttpStatus.OK);
        } catch (Exception exc) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Usuario não encontrado", exc
            );
        }
    }

    @CrossOrigin
    @PostMapping(value = "/cadastros")
    public ResponseEntity<Pessoa> postPessoas(
            @RequestBody @Validated Pessoa pessoa) {
        try {
            var pessoaUse = pessoasUseCases.postAll(pessoa);
            return new ResponseEntity<>(pessoaUse, HttpStatus.CREATED);
        } catch (Exception exc) {
            throw new ResponseStatusException(
                    HttpStatus.FOUND, "Não foi possível cadastrar.", exc
            );
        }
    }
}
