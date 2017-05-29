package br.com.gerenciador.entity;

import javax.persistence.*;

/**
 * Created by 201320336 on 20/04/2017.
 */
@Entity
public class IngredienteEntity {
	
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column
    private Long id;

    @Column
    private String nome;

    @Column
    private Double vlr_compra;

    @Column
    private Double vlr_venda;

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

    public IngredienteEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public IngredienteEntity setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public IngredienteEntity setVlr_compra(Double vlr_compra) {
        this.vlr_compra = vlr_compra;
        return this;
    }

    public IngredienteEntity setVlr_venda(Double vlr_venda) {
        this.vlr_venda = vlr_venda;
        return this;
    }
}
