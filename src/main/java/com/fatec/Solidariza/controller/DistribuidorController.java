package com.fatec.Solidariza.controller;

import com.fatec.Solidariza.entity.Distribuidor;
import com.fatec.Solidariza.repository.DistribuidorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/")
public class DistribuidorController {

    @Autowired
    DistribuidorRepository distribuidorRepository;

    @GetMapping("/distribuidores")
    public List<Distribuidor> lista(){
        return distribuidorRepository.findAll();
    }

    @GetMapping("/distribuidor/{id}")
    public Distribuidor listaId(@PathVariable(value="id") long id){
        return distribuidorRepository.findById(id);
    }

    @PostMapping("/distribuidor")
    public Distribuidor salvaDistribuidor(@RequestBody Distribuidor distribuidor){
        return distribuidorRepository.save(distribuidor);
    }
}
