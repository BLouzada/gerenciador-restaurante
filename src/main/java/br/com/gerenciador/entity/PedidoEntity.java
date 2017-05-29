package br.com.gerenciador.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by 201320336 on 20/04/2017.
 */
@Entity
public class PedidoEntity {
	
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="PEDIDO_ID")
    private Long id;
    
    @Column
    private Date horaEntrada;
    
    @Column
    private Date horaSaida;
    
    @Column
    private String massa;
    
    @Column
    private String molho;
    
    @Column
    private String carne;
        
    @OneToMany
    @JoinColumn(name="INGREDIENTE_ID", referencedColumnName="PEDIDO_ID")
    private List<String> ingredientes;
    
    @Column
    private String bebida;
    
}
