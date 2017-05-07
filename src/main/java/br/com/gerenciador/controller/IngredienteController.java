package br.com.gerenciador.controller;

import br.com.gerenciador.api.Cliente;
import br.com.gerenciador.api.Ingrediente;
import br.com.gerenciador.service.ClienteService;
import br.com.gerenciador.service.IngredienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IngredienteController {

    @Autowired
    IngredienteService ingredienteService;

    @RequestMapping("/ingrediente")
    public Ingrediente get() {
        return ingredienteService.get();
    }
}
