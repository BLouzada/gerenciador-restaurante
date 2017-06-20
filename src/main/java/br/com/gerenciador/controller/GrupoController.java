package br.com.gerenciador.controller;


import br.com.gerenciador.beans.Grupo;
import br.com.gerenciador.beans.Ingrediente;
import br.com.gerenciador.service.GrupoService;
import br.com.gerenciador.service.IngredienteService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;

@Controller
public class GrupoController {

    private IngredienteService ingredienteService;
    private GrupoService grupoService;
    private Gson gson = new GsonBuilder().serializeNulls().create();

    public GrupoController(IngredienteService ingredienteService, GrupoService grupoService) {
        this.ingredienteService = ingredienteService;
        this.grupoService = grupoService;
    }

    @RequestMapping("/grupos")
    public String getAll(Model model) {
        return mostrarTodosGrupos(model);
    }

    @RequestMapping(value = "/grupos",method = RequestMethod.POST)
    public String salvarGrupo(Model model, @RequestParam Map<String, String> body) {
        String grupoStr = gson.toJson(body);
        Grupo grupo = gson.fromJson(grupoStr, Grupo.class);
        grupoService.save(grupo);
        return mostrarTodosGrupos(model);
    }

    private String mostrarTodosGrupos(Model model) {
        ArrayList <Grupo> grupos = grupoService.getAll();
        ArrayList <Ingrediente> ingredientes = ingredienteService.getAll();
        model.addAttribute("ingredientes", ingredientes);
        model.addAttribute("novoGrupo", new Grupo());
        model.addAttribute("grupos", grupos);
        return "grupos";
    }
}
