package com.example.demo.Model;

import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "giocatore")
public class Giocatore {
    @Id // PK
    @GeneratedValue(strategy= GenerationType.IDENTITY) //  use a MySQL AUTO_INCREMENT column, you are supposed to use an IDENTITY strategy
    private Integer id;
    private String nome;
    private Integer età;
    private Boolean capitano;
    private String squadra;

    public Giocatore() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getEtà() {
        return età;
    }

    public void setEtà(Integer età) {
        this.età = età;
    }

    public Boolean getCapitano() {
        return capitano;
    }

    public void setCapitano(Boolean capitano) {
        this.capitano = capitano;
    }

    public String getSquadra() {
        return squadra;
    }

    public void setSquadra(String squadra) {
        this.squadra = squadra;
    }


}



