package com.example.demo.Repository;

import com.example.demo.Model.Squadra;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SquadRepository extends CrudRepository<Squadra, Integer> {


}
