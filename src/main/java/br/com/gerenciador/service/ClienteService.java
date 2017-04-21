package br.com.gerenciador.service;

import br.com.gerenciador.api.Cliente;
import br.com.gerenciador.converters.ClienteEntityToCliente;
import br.com.gerenciador.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Created by 201320336 on 20/04/2017.
 */
@Service
public class ClienteService {

    ClienteRepository clienteRepository;
    ClienteEntityToCliente clienteEntityToCliente;

    public ClienteService(ClienteRepository clienteRepository, ClienteEntityToCliente clienteEntityToCliente) {
        this.clienteRepository = clienteRepository;
        this.clienteEntityToCliente = clienteEntityToCliente;
    }

    public Cliente get() {
        return clienteEntityToCliente.convert(clienteRepository.findOne(1L));
    }
}
