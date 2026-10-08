package com.senai.projeto.service;

import com.senai.projeto.dto.ClienteRequestDTO;
import com.senai.projeto.dto.ClienteResponseDTO;
import com.senai.projeto.entity.ClienteEntity;
import com.senai.projeto.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {


    @Autowired
    private ClienteRepository repository;

    // get
    public List<ClienteResponseDTO> listarTodosClientes() {
        return repository.findAll()
                .stream()
                .map(c -> new ClienteResponseDTO(c.getNome(), c.getEmail()))
                .toList();
    }

    // post
    public ClienteEntity salvarClientes(ClienteRequestDTO dto) {
        if (repository.findByNome(dto.getNome()).isPresent())
            throw new IllegalArgumentException("Cliente já existe");

        ClienteEntity novoCliente = new ClienteEntity();
        novoCliente.setNome(dto.getNome());
        novoCliente.setEmail(dto.getEmail());
        novoCliente.setTelefone(dto.getTelefone());

        return repository.save(novoCliente);
    }

    // put
    public ClienteEntity atualizarCliente(Long id, ClienteEntity cliente) {
        if (!repository.existsById(id))
            throw new IllegalArgumentException("Cliente não encontrado");
        return repository.save(cliente);

    }

    // delete
    public void deletarCliente(Long id) {
        if (!repository.existsById(id))
            throw new IllegalArgumentException("Cliente não encontrado");

        repository.deleteById(id);
    }
}
