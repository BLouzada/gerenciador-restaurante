package br.com.gerenciador.controller;


import br.com.gerenciador.api.Ingrediente;
import br.com.gerenciador.service.IngredienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class IngredienteController {

    private IngredienteService ingredienteService;

    public IngredienteController(IngredienteService ingredienteService) {
        this.ingredienteService = ingredienteService;
    }

    @RequestMapping("/ingredientes/{id}")
    public @ResponseBody Ingrediente get(@PathVariable("id") Long id) {
        return ingredienteService.getById(id);
    }

    @RequestMapping("/ingredientes")
    public  String getAll(Model model) {
        Ingrediente ingrediente1 = ingredienteService.getById(1L);
        model.addAttribute("ingredienteSelecionado", ingrediente1);
        ArrayList <Ingrediente> ingredientes = ingredienteService.getAll();
        model.addAttribute("ingredientes", ingredientes);
        return "ingredientes";


    }
    @RequestMapping(value = "/greeting" , method = RequestMethod.GET)
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}
