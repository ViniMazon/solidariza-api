package com.fatec.Solidariza.repository;

import com.fatec.Solidariza.entity.Distribuidor;
import com.fatec.Solidariza.entity.Registro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistroRepository extends JpaRepository<Registro, Integer> {

    Registro findById(long id);
    List<Registro> findByDistribuidor(Distribuidor distribuidor);
    //Registro findByDistribuidorId(int id);
    //List <Registro> findByDistribuidor(long distribuidor);

}
