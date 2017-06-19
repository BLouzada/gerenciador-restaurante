package br.com.gerenciador.converters;

import br.com.gerenciador.beans.Grupo;
import br.com.gerenciador.beans.Ingrediente;
import br.com.gerenciador.entity.GrupoEntity;
import br.com.gerenciador.entity.IngredienteEntity;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * Created by 201320336 on 20/04/2017.
 */
@Component
public class GrupoToGrupoEntity implements Converter<Grupo,GrupoEntity> {

    private IngredienteToIngredienteEntity ingredienteEntityToIngrediente;

    public GrupoToGrupoEntity(IngredienteToIngredienteEntity ingredienteEntityToIngrediente) {
        this.ingredienteEntityToIngrediente = ingredienteEntityToIngrediente;
    }

    @Override
    public GrupoEntity convert(Grupo source) {
        Long id = source.getId();
        ArrayList<IngredienteEntity> ingredientes = new ArrayList<IngredienteEntity>();
        for (Ingrediente ingrediente : source.getIngredientes()){
            ingredientes.add(ingredienteEntityToIngrediente.convert(ingrediente));
        }
        if(id != null){
            return new GrupoEntity()
                    .setId(id)
                    .setNome(source.getNome())
                    .setIngredientes(ingredientes);
        }else{
            return new GrupoEntity()
                    .setNome(source.getNome())
                    .setIngredientes(ingredientes);
        }


    }
}
