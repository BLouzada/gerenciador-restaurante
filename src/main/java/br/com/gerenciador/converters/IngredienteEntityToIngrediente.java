package br.com.gerenciador.converters;

import br.com.gerenciador.api.Ingrediente;
import br.com.gerenciador.api.Medida;
import br.com.gerenciador.entity.IngredienteEntity;
import br.com.gerenciador.entity.MedidaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 201320336 on 20/04/2017.
 */
@Component
public class IngredienteEntityToIngrediente implements Converter<IngredienteEntity,Ingrediente> {

    private MedidaEntityToMedida medidaEntityToMedida;

    public IngredienteEntityToIngrediente(MedidaEntityToMedida medidaEntityToMedida) {
        this.medidaEntityToMedida = medidaEntityToMedida;
    }

    @Override
    public Ingrediente convert(IngredienteEntity source) {
        List<Medida> medidas = new ArrayList<>();
        for( MedidaEntity medida : source.getMedidasEntities()){
            medidas.add(medidaEntityToMedida.convert(medida));
        }
        return new Ingrediente(source.getNome(),medidas);

    }
}
