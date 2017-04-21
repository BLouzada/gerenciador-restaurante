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
    private Long id;
    @Column
    private Date horaEntrada;
    @Column
    private Date horaSaida;
}
