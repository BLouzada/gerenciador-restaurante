package br.com.gerenciador.converters;

import br.com.gerenciador.api.Cliente;
import br.com.gerenciador.entity.ClienteEntity;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * Created by 201320336 on 20/04/2017.
 */
@Component
public class ClienteEntityToCliente implements Converter<ClienteEntity,Cliente> {

    @Override
    public Cliente convert(ClienteEntity source) {
        return new Cliente(source.getNome(),source.getPontosFidelidade());
    }
}
