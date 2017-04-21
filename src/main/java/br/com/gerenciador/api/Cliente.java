package br.com.gerenciador.api;

import java.util.List;

/**
 * Created by blouz on 10/04/2017.
 */
public class Cliente {

    private String nome;
    private int pontosFidelidade;
    private List<Pedido> pedidos;

    public Cliente(String nome, Integer pontosFidelidade) {
        this.nome = nome;
        this.pontosFidelidade = pontosFidelidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontosFidelidade() {
        return pontosFidelidade;
    }

    public void setPontosFidelidade(int pontosFidelidade) {
        this.pontosFidelidade = pontosFidelidade;
    }
}
