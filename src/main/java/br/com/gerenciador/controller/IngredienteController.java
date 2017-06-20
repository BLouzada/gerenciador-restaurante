package br.com.gerenciador.controller;


import br.com.gerenciador.beans.Ingrediente;
import br.com.gerenciador.service.IngredienteService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;

@Controller
public class IngredienteController {

    private IngredienteService ingredienteService;
    private Gson gson = new GsonBuilder().serializeNulls().create();

    public IngredienteController(IngredienteService ingredienteService) {
        this.ingredienteService = ingredienteService;
    }

    @RequestMapping("/ingredientes/{id}")
    public String get(Model model, @PathVariable("id") Long id) {
        Ingrediente ingrediente = ingredienteService.getById(id);
        model.addAttribute("ingrediente", ingrediente);
        return "ingrediente-selecionado";
    }

    @RequestMapping("/ingredientes")
        public String getAll(Model model) {
        return mostrarTodosIngredientes(model);
    }

    @RequestMapping(value = "/ingredientes",method = RequestMethod.POST)
    public String salvarIngrediente(Model model, @RequestParam Map<String, String> body) {
        String ingredienteStr = gson.toJson(body);
        Ingrediente ingrediente = gson.fromJson(ingredienteStr, Ingrediente.class);
        ingredienteService.save(ingrediente);
        return mostrarTodosIngredientes(model);
    }

    @RequestMapping(value = "/ingredientes/{id}",method = RequestMethod.POST)
    public String atualizarIngrediente(Model model, @PathVariable("id") Long id, @RequestParam Map<String, String> body) {
        String ingredienteStr = gson.toJson(body);
        Ingrediente ingrediente = gson.fromJson(ingredienteStr, Ingrediente.class);
        ingredienteService.update(id,ingrediente);
        return mostrarTodosIngredientes(model);
    }
    @RequestMapping(value = "/ingredientes/{id}",method = RequestMethod.DELETE)
    public String removerIngrediente(Model model, @PathVariable("id") Long id) {
        ingredienteService.remover(id);
        return mostrarTodosIngredientes(model);
    }
    private String mostrarTodosIngredientes(Model model){
        ArrayList <Ingrediente> ingredientes = ingredienteService.getAll();
        model.addAttribute("novoIngrediente", new Ingrediente());
        model.addAttribute("ingredientes", ingredientes);
        return "ingredientes";
    }
}
