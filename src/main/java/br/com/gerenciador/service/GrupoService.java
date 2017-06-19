package br.com.gerenciador.service;

import br.com.gerenciador.beans.Ingrediente;
import br.com.gerenciador.converters.IngredienteEntityToIngrediente;
import br.com.gerenciador.converters.IngredienteToIngredienteEntity;
import br.com.gerenciador.entity.IngredienteEntity;
import br.com.gerenciador.repository.IngredienteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by 201320336 on 20/04/2017.
 */
@Service
public class GrupoService {

    private IngredienteEntityToIngrediente ingredienteEntityToIngrediente;
    private IngredienteToIngredienteEntity ingredienteToIngredienteEntity;
    private IngredienteRepository ingredienteRepository;

    public GrupoService(IngredienteEntityToIngrediente ingredienteEntityToIngrediente, IngredienteToIngredienteEntity ingredienteToIngredienteEntity, IngredienteRepository ingredienteRepository) {
        this.ingredienteEntityToIngrediente = ingredienteEntityToIngrediente;
        this.ingredienteToIngredienteEntity = ingredienteToIngredienteEntity;
        this.ingredienteRepository = ingredienteRepository;
    }

    public Ingrediente getById(Long id){
        return ingredienteEntityToIngrediente.convert(ingredienteRepository.findOne(id));
    }

    public ArrayList<Ingrediente> getAll() {
        ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
        for(IngredienteEntity ingredienteEntity: ingredienteRepository.findAll()){
            ingredientes.add(ingredienteEntityToIngrediente.convert(ingredienteEntity));
        }
        return ingredientes;
    }

    public HttpStatus save(Ingrediente ingrediente) {
        ingredienteRepository.save(ingredienteToIngredienteEntity.convert(ingrediente));
        return HttpStatus.ACCEPTED;
    }

    public HttpStatus update(Long id, Ingrediente ingrediente) {
        IngredienteEntity ingredienteEntity = ingredienteRepository.findOne(id);
        ingredienteEntity.setNome(ingrediente.getNome());
        ingredienteEntity.setVlr_compra(ingrediente.getVlr_compra());
        ingredienteEntity.setVlr_venda(ingrediente.getVlr_venda());
        ingredienteRepository.save(ingredienteEntity);
        return HttpStatus.ACCEPTED;
    }

    public HttpStatus remover(Long id) {
        ingredienteRepository.delete(id);
        return HttpStatus.ACCEPTED;
    }
}
