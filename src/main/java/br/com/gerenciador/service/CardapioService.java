package br.com.gerenciador.service;

import br.com.gerenciador.beans.Cardapio;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by 201320336 on 05/06/2017.
 */
@Service
public class CardapioService {
    public ArrayList<Cardapio> getAll() {
        return new ArrayList<Cardapio>();
    }

    public Cardapio getById(Long id) {
        return new Cardapio();
    }

    public HttpStatus save(Cardapio cardapio) {
        return HttpStatus.ALREADY_REPORTED;
    }

    public HttpStatus update(Long id, Cardapio cardapio) {
        return HttpStatus.ALREADY_REPORTED;
    }

    public HttpStatus remover(Long id) {
        return HttpStatus.ALREADY_REPORTED;
    }
}
