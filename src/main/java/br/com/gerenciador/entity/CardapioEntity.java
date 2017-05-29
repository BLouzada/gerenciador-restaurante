package br.com.gerenciador.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 201320336 on 20/04/2017.
 */
@Entity
public class CardapioEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column
    private Long id;

    @Column
    private String nome;

    @OneToMany
    @JoinColumn(name = "CARDAPIO_ID")
    private List<ReceitaEntity> receitas;

    public Long getId() {
        return id;
    }

    public CardapioEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public CardapioEntity setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public List<ReceitaEntity> getReceitas() {
        return receitas;
    }

    public CardapioEntity setReceitas(List<ReceitaEntity> receitas) {
        this.receitas = receitas;
        return this;
    }
}
