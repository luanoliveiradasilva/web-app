package com.example.webapp.repository;


import com.example.webapp.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PessoaRepo extends JpaRepository<Pessoa, Long> {
}
