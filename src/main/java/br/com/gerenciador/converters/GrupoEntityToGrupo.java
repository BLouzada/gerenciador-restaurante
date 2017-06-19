package br.com.gerenciador.converters;

import br.com.gerenciador.beans.Grupo;
import br.com.gerenciador.beans.Ingrediente;
import br.com.gerenciador.entity.GrupoEntity;
import br.com.gerenciador.entity.IngredienteEntity;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * Created by 201320336 on 20/04/2017.
 */
@Component
public class GrupoEntityToGrupo implements Converter<GrupoEntity,Grupo> {

    @Override
    public Grupo convert(GrupoEntity source) {
        Long id = source.getId();
        if(id != null){
            return new Ingrediente()
                    .setId(id)
                    .setNome(source.getNome())
                    .setVlr_compra(source.getVlr_compra())
                    .setVlr_venda(source.getVlr_venda());
        }else{
            return new Ingrediente()
                    .setNome(source.getNome())
                    .setVlr_compra(source.getVlr_compra())
                    .setVlr_venda(source.getVlr_venda());
        }


    }
}
