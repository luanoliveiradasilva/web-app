package com.example.webapp.usecases;

import com.example.webapp.model.Pessoa;

import java.util.List;

public interface PessoaUseCasesImpl {
    List<Pessoa> findAll();
    Pessoa postAll(Pessoa pessoas);
}
