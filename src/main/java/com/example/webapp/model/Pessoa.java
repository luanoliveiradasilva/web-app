package com.example.webapp.model;






import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Pessoa")
@Data
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JoinColumn(name = "id_ID", nullable = false)
    private Long id;

    @JoinColumn(name = "nome_ID", nullable = false)
    private String nome;

    @Column(name = "cpf", nullable = false)
    private String cpf;

    @Column(name = "data", nullable = false)
    private String data;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getData(){
        return data;
    }

    public void setData(String data){
        this.data = data;
    }
}
