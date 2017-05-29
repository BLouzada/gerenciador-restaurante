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
    @Column(name="INGREDIENTE_ID")
    private Long id;

    @Column
    private String nome;
    
}
