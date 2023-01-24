package com.example.demo.Repository;

import com.example.demo.Model.Giocatore;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GiocatoreRepository extends CrudRepository <Giocatore, Integer> {
// estendo la classe per le operazioni crud da usare nel service che richiamerò nel controller
   // Giocatore findByName(String nome);

}
