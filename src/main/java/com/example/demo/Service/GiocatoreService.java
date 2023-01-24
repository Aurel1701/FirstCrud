package com.example.demo.Service;

import com.example.demo.Model.Giocatore;
import com.example.demo.Repository.GiocatoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class GiocatoreService {
    @Autowired // evito di avere l'xml
    GiocatoreRepository giocatoreRepository;

    // ritona tutta la lista del db
    public List<Giocatore> getGiocatori(){
        return (List<Giocatore>) giocatoreRepository.findAll();
    }

    public Giocatore saveGiocatore(Giocatore giocatore){
        return giocatoreRepository.save(giocatore);
    }

    public List<Giocatore> saveGiocatori(List<Giocatore> giocatori){
        return (List<Giocatore>) giocatoreRepository.saveAll(giocatori);
    }


    // ritorna id scelto
    public Optional<Giocatore>  getGiocatore(Integer id){
        Optional<Giocatore> ricercaGiocatore =  giocatoreRepository.findById(id);  // torna una risposta a prescindere
        return ricercaGiocatore;
    }

    //ritorna nome per l'id scelto
   // public Giocatore getNameGiocatore(String nome){
      // return giocatoreRepository.findByName(nome);
   // }

    public  String getNameGiocatore(Integer id){
        Optional<Giocatore> ricercaGiocatore =  giocatoreRepository.findById(id);
        return ricercaGiocatore.get().getNome();
    }

    // cancella giocatore

    public String cancellaGiocatore(Integer id){
          giocatoreRepository.deleteById(id);
          return "Giocatore rimosso!" + id;
    }

    //edit giocatore

    public Giocatore updateGiocatore(Giocatore giocatore){
        Giocatore giocatoreEsistente = giocatoreRepository.findById(giocatore.getId()).orElse(null);
        giocatoreEsistente.setNome(giocatore.getNome());
        giocatoreEsistente.setEtà(giocatore.getEtà());
        giocatoreEsistente.setCapitano(giocatore.getCapitano());
        giocatoreEsistente.setSquadra(giocatore.getSquadra());
        return giocatoreRepository.save(giocatoreEsistente);
    }





}
