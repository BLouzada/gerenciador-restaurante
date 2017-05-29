package br.com.gerenciador.service;

import br.com.gerenciador.api.Ingrediente;
import br.com.gerenciador.converters.IngredienteEntityToIngrediente;
import br.com.gerenciador.repository.IngredienteRepository;
import org.springframework.stereotype.Service;

/**
 * Created by 201320336 on 20/04/2017.
 */
@Service
public class IngredienteService {

    private IngredienteEntityToIngrediente ingredienteEntityToIngrediente;
    private IngredienteRepository ingredienteRepository;

    public IngredienteService(IngredienteEntityToIngrediente ingredienteEntityToIngrediente, IngredienteRepository ingredienteRepository) {
        this.ingredienteEntityToIngrediente = ingredienteEntityToIngrediente;
        this.ingredienteRepository = ingredienteRepository;
    }

    public Ingrediente getById(Long id){
        return ingredienteEntityToIngrediente.convert(ingredienteRepository.findOne(id));
    }
}
