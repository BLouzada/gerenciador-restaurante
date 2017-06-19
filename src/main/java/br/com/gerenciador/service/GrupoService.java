package br.com.gerenciador.service;

import br.com.gerenciador.beans.Grupo;
import br.com.gerenciador.beans.Ingrediente;
import br.com.gerenciador.converters.GrupoEntityToGrupo;
import br.com.gerenciador.converters.GrupoToGrupoEntity;
import br.com.gerenciador.converters.IngredienteEntityToIngrediente;
import br.com.gerenciador.converters.IngredienteToIngredienteEntity;
import br.com.gerenciador.entity.GrupoEntity;
import br.com.gerenciador.entity.IngredienteEntity;
import br.com.gerenciador.repository.GrupoRepository;
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
    private GrupoEntityToGrupo grupoEntityToGrupo;
    private GrupoToGrupoEntity grupoToGrupoEntity;
    private IngredienteRepository ingredienteRepository;
    private GrupoRepository grupoRepository;

    public GrupoService(IngredienteEntityToIngrediente ingredienteEntityToIngrediente, IngredienteToIngredienteEntity ingredienteToIngredienteEntity, GrupoToGrupoEntity grupoToGrupoEntity, IngredienteRepository ingredienteRepository, GrupoEntityToGrupo grupoEntityToGrupo, GrupoRepository grupoRepository) {
        this.ingredienteEntityToIngrediente = ingredienteEntityToIngrediente;
        this.ingredienteToIngredienteEntity = ingredienteToIngredienteEntity;
        this.grupoToGrupoEntity = grupoToGrupoEntity;
        this.ingredienteRepository = ingredienteRepository;
        this.grupoEntityToGrupo = grupoEntityToGrupo;
        this.grupoRepository = grupoRepository;
    }

    public Grupo getById(Long id){
        return grupoEntityToGrupo.convert(grupoRepository.findOne(id));
    }

    public ArrayList<Grupo> getAll() {
        ArrayList<Grupo> grupos = new ArrayList<Grupo>();
        for(GrupoEntity grupoEntity: grupoRepository.findAll()){
            grupos.add(grupoEntityToGrupo.convert(grupoEntity));
        }
        return grupos;
    }

    public HttpStatus save(Grupo grupo) {
        grupoRepository.save(grupoToGrupoEntity.convert(grupo));
        return HttpStatus.ACCEPTED;
    }

    public HttpStatus update(Long id, Grupo grupo) {
        ArrayList<IngredienteEntity> ingredientes = new ArrayList<IngredienteEntity>();
        for(Ingrediente ingrediente : grupo.getIngredientes()){
            ingredientes.add(ingredienteToIngredienteEntity.convert(ingrediente));
        }
        GrupoEntity grupoEntity = grupoRepository.findOne(id);
        grupoEntity.setNome(grupo.getNome());
        grupoEntity.setIngredientes(ingredientes);
        grupoRepository.save(grupoEntity);
        return HttpStatus.ACCEPTED;
    }

    public HttpStatus remover(Long id) {
        grupoRepository.delete(id);
        return HttpStatus.ACCEPTED;
    }
}
