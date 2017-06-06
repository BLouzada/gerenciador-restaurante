package br.com.gerenciador.controller;

import br.com.gerenciador.beans.Cardapio;
import br.com.gerenciador.beans.Ingrediente;
import br.com.gerenciador.service.CardapioService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class CardapioController {

    private CardapioService cardapioService;

    public CardapioController(CardapioService cardapioService) {
        this.cardapioService = cardapioService;
    }

    @RequestMapping("/cardapios")
    public @ResponseBody ArrayList<Cardapio> getAll() {
           return cardapioService.getAll();

    }

    @RequestMapping("/cardapios/{id}")
    public @ResponseBody Cardapio get(@PathVariable("id") Long id) {
        return cardapioService.getById(id);
    }

    @RequestMapping(value = "/cardapios",method = RequestMethod.POST)
    public @ResponseBody HttpStatus salvarCardapio(@RequestBody Cardapio cardapio) {
        return cardapioService.save(cardapio);
    }

    @RequestMapping(value = "/cardapios/{id}",method = RequestMethod.PUT)
    public @ResponseBody  HttpStatus atualizarCardapio(@PathVariable("id") Long id, @RequestBody Cardapio cardapio) {
        return cardapioService.update(id,cardapio);
    }
    @RequestMapping(value = "/cardapios/{id}",method = RequestMethod.DELETE)
    public @ResponseBody  HttpStatus removerCardapio(@PathVariable("id") Long id) {
        return cardapioService.remover(id);
    }
}
