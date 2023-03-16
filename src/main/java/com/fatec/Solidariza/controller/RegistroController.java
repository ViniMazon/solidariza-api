package com.fatec.Solidariza.controller;

import com.fatec.Solidariza.entity.Distribuidor;
import com.fatec.Solidariza.entity.Registro;
import com.fatec.Solidariza.repository.DistribuidorRepository;
import com.fatec.Solidariza.repository.RegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class RegistroController {

    @Autowired
    RegistroRepository registroRepository;

    @Autowired
    DistribuidorRepository distribuidorRepository;


    @GetMapping("/registros")
    public List<Registro> lista(){
        return registroRepository.findAll();
    }

    @GetMapping("/distribuidor/{distribuidor_id}/registros")
    public List<Registro> listaId(@PathVariable("distribuidor_id") int id){
        Distribuidor distribuidor = distribuidorRepository.findById(id);
        return registroRepository.findByDistribuidor(distribuidor);
    }
    /*
        @GetMapping("/distribuidor/{distribuidor_id}/registros")
        public ResponseEntity<Registro> alistaId(@PathVariable("distribuidor_id") int dis_id){
            //Distribuidor distribuidor = distribuidorRepository.findById(dis_id);
            Optional<Registro> registro = registroRepository.findByDistribuidorId(dis_id);
            return ;
        }
    */
    @PostMapping("/registro")
    public Registro salvaRegistro(@RequestBody Registro registro){
        return registroRepository.save(registro);
    }

    @PostMapping("/registro/{distribuidor_id}")
    public Registro registroAdd(@PathVariable("distribuidor_id") int dis_id,@RequestBody Registro registro){
        Distribuidor distribuidor = distribuidorRepository.findById(dis_id);
        registro.setDistribuidor(distribuidor);
        return registroRepository.save(registro);

    }

}
