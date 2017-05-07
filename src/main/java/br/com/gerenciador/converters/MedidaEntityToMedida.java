package br.com.gerenciador.converters;

import br.com.gerenciador.api.Cliente;
import br.com.gerenciador.api.Medida;
import br.com.gerenciador.entity.ClienteEntity;
import br.com.gerenciador.entity.MedidaEntity;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * Created by 201320336 on 20/04/2017.
 */
@Component
public class MedidaEntityToMedida implements Converter<MedidaEntity,Medida> {

    @Override
    public Medida convert(MedidaEntity source) {
        return new Medida(source.getNome());
    }
}
