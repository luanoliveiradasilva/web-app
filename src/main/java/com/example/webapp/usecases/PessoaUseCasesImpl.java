package com.example.webapp.usecases;

import com.example.webapp.model.Pessoa;

import java.util.List;

public interface PessoaUseCasesImpl {
    public List<Pessoa> findAll();
    public Pessoa postAll(Pessoa pessoas);
}
