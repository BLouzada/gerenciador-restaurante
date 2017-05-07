package br.com.gerenciador.service;

import br.com.gerenciador.api.Ingrediente;
import br.com.gerenciador.converters.IngredienteEntityToIngrediente;
import br.com.gerenciador.entity.IngredienteEntity;
import br.com.gerenciador.entity.MedidaEntity;
import br.com.gerenciador.repository.IngredienteRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by 201320336 on 20/04/2017.
 */
@Service
public class IngredienteService {

    private IngredienteRepository ingredienteRepository;
    private IngredienteEntityToIngrediente ingredienteEntityToIngrediente;

    public IngredienteService(IngredienteRepository ingredienteRepository, IngredienteEntityToIngrediente ingredienteEntityToIngrediente) {
        this.ingredienteRepository = ingredienteRepository;
        this.ingredienteEntityToIngrediente = ingredienteEntityToIngrediente;
    }

    public Ingrediente get() {
        IngredienteEntity i = new IngredienteEntity("Arroz",new ArrayList<MedidaEntity>());
        ingredienteRepository.save(i);
        return ingredienteEntityToIngrediente.convert(ingredienteRepository.findOne(1L));
    }
}
