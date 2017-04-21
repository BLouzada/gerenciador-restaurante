package br.com.gerenciador.controller;

import java.util.concurrent.atomic.AtomicLong;

import br.com.gerenciador.api.Cliente;
import br.com.gerenciador.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
    @Autowired
    ClienteService clienteService;

    @RequestMapping("/cliente")
    public Cliente get() {
        return clienteService.get();
    }
}
