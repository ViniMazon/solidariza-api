package com.fatec.Solidariza.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Registro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "distribuidor_id")
    private Distribuidor distribuidor;

    private int quantidade;

    private int peso;

    private BigDecimal preco;

    public Registro() {
    }

    public int getId() {
        return id;
    }

    public Registro setId(int id) {
        this.id = id;
        return this;
    }

    public Distribuidor getDistribuidor() {
        return distribuidor;
    }

    public Registro setDistribuidor(Distribuidor distribuidor) {
        this.distribuidor = distribuidor;
        return this;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Registro setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        return this;
    }

    public int getPeso() {
        return peso;
    }

    public Registro setPeso(int peso) {
        this.peso = peso;
        return this;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public Registro setPreco(BigDecimal preco) {
        this.preco = preco;
        return this;
    }
}

