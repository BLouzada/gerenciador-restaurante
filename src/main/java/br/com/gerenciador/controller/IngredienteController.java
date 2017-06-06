package br.com.gerenciador.controller;


import br.com.gerenciador.beans.Ingrediente;
import br.com.gerenciador.service.IngredienteService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class IngredienteController {

    private IngredienteService ingredienteService;

    public IngredienteController(IngredienteService ingredienteService) {
        this.ingredienteService = ingredienteService;
    }

    @RequestMapping("/ingredientes")
    public @ResponseBody ArrayList<Ingrediente> getAll() {
           return ingredienteService.getAll();

    }

    @RequestMapping("/ingredientes/{id}")
    public @ResponseBody Ingrediente get(@PathVariable("id") Long id) {
        return ingredienteService.getById(id);
    }

    @RequestMapping(value = "/ingredientes",method = RequestMethod.POST)
    public @ResponseBody HttpStatus salvarIngrediente(@RequestBody Ingrediente ingrediente) {
        return ingredienteService.save(ingrediente);
    }

    @RequestMapping(value = "/ingredientes/{id}",method = RequestMethod.PUT)
    public @ResponseBody  HttpStatus atualizarIngrediente(@PathVariable("id") Long id, @RequestBody Ingrediente ingrediente) {
        return ingredienteService.update(id,ingrediente);
    }
    @RequestMapping(value = "/ingredientes/{id}",method = RequestMethod.DELETE)
    public @ResponseBody  HttpStatus removerIngrediente(@PathVariable("id") Long id) {
        return ingredienteService.remover(id);
    }
}
