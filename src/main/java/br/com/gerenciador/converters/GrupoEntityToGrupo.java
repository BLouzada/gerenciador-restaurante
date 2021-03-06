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
public class GrupoEntityToGrupo implements Converter<GrupoEntity,Grupo> {

    private IngredienteEntityToIngrediente ingredienteEntityToIngrediente;

    public GrupoEntityToGrupo(IngredienteEntityToIngrediente ingredienteEntityToIngrediente) {
        this.ingredienteEntityToIngrediente = ingredienteEntityToIngrediente;
    }

    @Override
    public Grupo convert(GrupoEntity source) {
        Long id = source.getId();
        ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
        for (IngredienteEntity ingrediente : source.getIngredientes()){
            ingredientes.add(ingredienteEntityToIngrediente.convert(ingrediente));
        }
        if(id != null){
            return new Grupo()
                    .setId(id)
                    .setNome(source.getNome())
                    .setIngredientes(ingredientes);
        }else{
            return new Grupo()
                    .setNome(source.getNome())
                    .setIngredientes(ingredientes);
        }


    }
}
