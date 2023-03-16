package com.fatec.Solidariza.repository;


import com.fatec.Solidariza.entity.Distribuidor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DistribuidorRepository extends JpaRepository<Distribuidor, Integer> {

    Distribuidor findById(long id);

}
