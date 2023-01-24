package com.example.demo.Service;

import com.example.demo.Model.Squadra;
import com.example.demo.Repository.SquadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SquadraService {
    @Autowired
    SquadRepository squadRepository;

    public List<Squadra> getSquadre(){
        return (List<Squadra>) squadRepository.findAll();
    }

}
