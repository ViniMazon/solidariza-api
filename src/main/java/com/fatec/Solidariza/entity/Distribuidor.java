package com.fatec.Solidariza.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "distribuidor")
public class Distribuidor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
    private String produto;
    private String endereco;
    private String regiao;


    @OneToMany(mappedBy = "distribuidor", cascade = CascadeType.REMOVE)
    private List<Registro> registros;

    public Distribuidor() {
    }

    public int getId() {
        return id;
    }

    public Distribuidor setId(int id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Distribuidor setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getProduto() {
        return produto;
    }

    public Distribuidor setProduto(String produto) {
        this.produto = produto;
        return this;
    }

    public String getEndereco() {
        return endereco;
    }

    public Distribuidor setEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public String getRegiao() {
        return regiao;
    }

    public Distribuidor setRegiao(String regiao) {
        this.regiao = regiao;
        return this;
    }

    public List<Registro> getRegistros() {
        return registros;
    }

    public Distribuidor setRegistros(List<Registro> registros) {
        this.registros = registros;
        return this;
    }
}
