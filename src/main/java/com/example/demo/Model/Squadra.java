package com.example.demo.Model;


import org.springframework.data.relational.core.mapping.Table;
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity(name = "squadra")
public class Squadra {

    @Id
    private Integer id;
    private String nome;

    public Squadra() {
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
