package br.com.gerenciador.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 201320336 on 20/04/2017.
 */
@Entity
public class ReceitaEntity {
	
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column
    private Long id;

    @Column
    private String nome;

    @OneToMany
    @JoinColumn(name = "RECEITA_ID")
    private  List<GrupoEntity> grupos;

    public Long getId() {
        return id;
    }

    public ReceitaEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public ReceitaEntity setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public List<GrupoEntity> getGrupos() {
        return grupos;
    }

    public ReceitaEntity setGrupos(List<GrupoEntity> grupos) {
        this.grupos = grupos;
        return this;
    }
}
