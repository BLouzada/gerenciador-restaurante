package br.com.gerenciador.beans;

import br.com.gerenciador.entity.IngredienteEntity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by 201320336 on 19/06/2017.
 */
public class Grupo {

    private Long id;
    private String nome;
    private List<Ingrediente> ingredientes;

    public Long getId() {
        return id;
    }

    public Grupo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Grupo setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public Grupo setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
        return this;
    }
}
