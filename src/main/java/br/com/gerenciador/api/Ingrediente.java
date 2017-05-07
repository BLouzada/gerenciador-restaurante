package br.com.gerenciador.api;

import br.com.gerenciador.entity.MedidaEntity;

import java.util.List;

/**
 * Created by blouz on 07/05/2017.
 */
public class Ingrediente {

    private String nome;

    private List<Medida> medidas;

    public Ingrediente(String nome, List<Medida> medidas) {
        this.nome = nome;
        this.medidas = medidas;
    }

    public String getNome() {
        return nome;
    }

    public List<Medida> getMedidas() {
        return medidas;
    }
}
