package com.example.webapp.usecases;

import com.example.webapp.model.Pessoa;
import com.example.webapp.repository.PessoaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class PessoaUseCases {

    @Autowired
    private PessoaRepo pessoaRepo;

    public List<Pessoa> pegarTodasAsPessoas(){
        return pessoaRepo.findAll();
    }

}
