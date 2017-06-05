package br.com.gerenciador.converters;

import br.com.gerenciador.api.Ingrediente;
import br.com.gerenciador.entity.IngredienteEntity;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * Created by 201320336 on 20/04/2017.
 */
@Component
public class IngredienteToIngredienteEntity implements Converter<Ingrediente,IngredienteEntity> {

    @Override
    public IngredienteEntity convert(Ingrediente source) {

        return new IngredienteEntity()
                .setId(source.getId())
                .setNome(source.getNome())
                .setVlr_compra(source.getVlr_compra())
                .setVlr_venda(source.getVlr_venda());
    }
}
