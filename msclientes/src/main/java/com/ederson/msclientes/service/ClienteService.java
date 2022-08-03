package com.ederson.msclientes.service;

import com.ederson.msclientes.entity.Cliente;
import com.ederson.msclientes.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    @Transactional
    public Cliente save(Cliente cliente){
        return repository.save(cliente);
    }

    public Optional<Cliente>getByCpf(String cpf){
        return repository.findByCpf(cpf);
    }
}
