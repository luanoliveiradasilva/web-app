package com.example.webapp.usecases.Pessoas;

import com.example.webapp.model.Pessoa;
import com.example.webapp.repository.PessoaRepo;
import com.example.webapp.usecases.PessoaUseCasesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaUseCases implements PessoaUseCasesImpl {

    @Autowired
    private PessoaRepo pessoaRepo;

    @Override
    public List<Pessoa> findAll() {
        return pessoaRepo.findAll();
    }

    @Override
    public Pessoa postAll(Pessoa pessoas) {
        return pessoaRepo.save(pessoas);
    }


}
