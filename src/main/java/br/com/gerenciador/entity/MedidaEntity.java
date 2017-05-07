package br.com.gerenciador.entity;

import javax.persistence.*;

/**
 * Created by 201320336 on 20/04/2017.
 */
@Entity
public class MedidaEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column
    private String nome;

    public String getNome() {
        return nome;
    }
}
