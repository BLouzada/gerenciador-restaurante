package br.com.gerenciador.controller;


import br.com.gerenciador.api.Ingrediente;
import br.com.gerenciador.service.IngredienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IngredienteController {

    private IngredienteService ingredienteService;

    public IngredienteController(IngredienteService ingredienteService) {
        this.ingredienteService = ingredienteService;
    }

    @RequestMapping("/ingrediente/{id}")
    public Ingrediente get(@PathVariable("id") Long id) {
        return ingredienteService.getById(id);
    }
}
