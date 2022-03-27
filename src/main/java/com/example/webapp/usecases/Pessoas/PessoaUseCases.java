package com.example.webapp.usecases.Pessoas;

import com.example.webapp.model.Pessoa;
import com.example.webapp.repository.PessoaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaUseCases {

    private final PessoaRepo pessoaRepo;

    @Autowired
    public PessoaUseCases(PessoaRepo pessoaRepo) {
        this.pessoaRepo = pessoaRepo;
    }

    public List<Pessoa> findAll() {
        return pessoaRepo.findAll();
    }

    public Pessoa postAll(Pessoa pessoas) throws Exception {
        if (pessoas != null) {
            return pessoaRepo.save(pessoas);
        } throw new Exception("Não foi possível cadastrar usuário");
    }


}
