package com.example.demo.HelloController;
import com.example.demo.Model.Squadra;
import com.example.demo.Service.SquadraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class squadraController {

    @Autowired
    SquadraService squadraService;

    @GetMapping("/squadra")
    public List<Squadra> squadra(){
        return squadraService.getSquadre();
    }


}
