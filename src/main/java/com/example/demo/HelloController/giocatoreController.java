package com.example.demo.HelloController;


import com.example.demo.Model.Giocatore;
import com.example.demo.Service.GiocatoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class giocatoreController {

    @Autowired // Spring definisce le dipendenze tra bean, evita doverle definire esplicitamente
    GiocatoreService giocatoreService;


    @GetMapping("/test")
    public String test(){
        return "Ciaoooo Giocatore Test";
    }
// aggiungigiocatore
    @PostMapping("/addGiocatore")
    public Giocatore addGiocatore(@RequestBody Giocatore giocatore){
        return giocatoreService.saveGiocatore(giocatore);
    }
    //aggiungi piu giocatori
    @PostMapping("/addGiocatori")
    public List<Giocatore> addGiocatori(@RequestBody List<Giocatore> giocatore){
        return giocatoreService.saveGiocatori((List<Giocatore>) giocatore);
    }


    @GetMapping("/giocatori")
    public List<Giocatore> giocatore(){
        return giocatoreService.getGiocatori();
    }

    // ricerca qualsiasi giocatore

    @GetMapping("/giocatore/{id}")
    public Optional<Giocatore> giocatori(@PathVariable Integer id){
        return giocatoreService.getGiocatore(id);
    }

    // ritorna il nome dell'id cercato

    @GetMapping("giocatore/name/{id}")
    public String nameGiocatore(@PathVariable Integer id){
        return  giocatoreService.getNameGiocatore(id);
    }

     //edit giocatore
    @PutMapping("/update/{id}")
    public Giocatore editGiocatore(@RequestBody Giocatore giocatore){
        return giocatoreService.updateGiocatore(giocatore);
    }

     //delete giocatore
    @DeleteMapping("/delete/{id}")
    public String cancellaGiocatore(@PathVariable Integer id){
        return giocatoreService.cancellaGiocatore(id);

    }

















}

