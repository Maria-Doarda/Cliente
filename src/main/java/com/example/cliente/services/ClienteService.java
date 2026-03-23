package com.example.cliente.services;

import com.example.cliente.models.ClienteModel;
import com.example.cliente.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteModel criarCliente(ClienteModel clienteModel){
        return clienteRepository.save(clienteModel);
    }

    public List<ClienteModel> findAll(){
        return clienteRepository.findAll();
    }

    public Optional<ClienteModel> buscarId(Long id){
        return clienteRepository.findById(id);
    }

    public void deletar(Long id){
        clienteRepository.deleteById(id);
    }
}
