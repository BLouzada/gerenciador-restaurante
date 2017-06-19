package br.com.gerenciador.controller;


import br.com.gerenciador.beans.Ingrediente;
import br.com.gerenciador.service.IngredienteService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Map;

@Controller
public class GrupoController {

    private IngredienteService ingredienteService;
    private Gson gson = new GsonBuilder().serializeNulls().create();

    public GrupoController(IngredienteService ingredienteService) {
        this.ingredienteService = ingredienteService;
    }
}
