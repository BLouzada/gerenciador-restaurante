package br.com.gerenciador.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 201320336 on 20/04/2017.
 */
@Entity
public class GrupoEntity {
	
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column
    private Long id;

    @Column
    private String nome;

    @OneToMany
    @JoinColumn(name = "GRUPO_ID")
    private List<IngredienteEntity> ingredientes;

    public Long getId() {
        return id;
    }

    public GrupoEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public GrupoEntity setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public List<IngredienteEntity> getIngredientes() {
        return ingredientes;
    }

    public GrupoEntity setIngredientes(List<IngredienteEntity> ingredientes) {
        this.ingredientes = ingredientes;
        return this;
    }
}
