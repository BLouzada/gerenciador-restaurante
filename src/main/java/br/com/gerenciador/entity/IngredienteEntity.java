package br.com.gerenciador.entity;

import br.com.gerenciador.api.Medida;

import javax.persistence.*;
import java.util.List;

/**
 * Created by 201320336 on 20/04/2017.
 */
@Entity
public class IngredienteEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column
    private String nome;

    @OneToMany()
    private List<MedidaEntity> medidasEntities;

    public IngredienteEntity(String nome, List<MedidaEntity> medidasEntities) {
        this.nome = nome;
        this.medidasEntities = medidasEntities;
    }

    public String getNome() {
        return nome;
    }

    public List<MedidaEntity> getMedidasEntities() {
        return medidasEntities;
    }

}
