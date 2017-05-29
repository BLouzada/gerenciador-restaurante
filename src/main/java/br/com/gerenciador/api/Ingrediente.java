package br.com.gerenciador.api;

import java.util.List;

/**
 * Created by blouz on 07/05/2017.
 */
public class Ingrediente {

    private Long id;
    private String nome;
    private Double vlr_compra;
    private Double vlr_venda;

    public Ingrediente setId(Long id) {
        this.id = id;
        return this;
    }

    public Ingrediente setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Ingrediente setVlr_compra(Double vlr_compra) {
        this.vlr_compra = vlr_compra;
        return this;
    }

    public Ingrediente setVlr_venda(Double vlr_venda) {
        this.vlr_venda = vlr_venda;
        return this;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getVlr_compra() {
        return vlr_compra;
    }

    public Double getVlr_venda() {
        return vlr_venda;
    }
}
