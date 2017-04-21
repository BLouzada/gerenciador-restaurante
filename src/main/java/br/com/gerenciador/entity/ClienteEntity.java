package br.com.gerenciador.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by 201320336 on 20/04/2017.
 */
@Entity
public class ClienteEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column
    private String nome;
    @Column
    private Integer pontosFidelidade;

    public String getNome() {
        return nome;
    }

    public Integer getPontosFidelidade() {
        return pontosFidelidade;
    }
}
