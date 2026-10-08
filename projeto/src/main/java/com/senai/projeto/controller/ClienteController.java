package com.senai.projeto.controller;


import com.senai.projeto.dto.ClienteRequestDTO;
import com.senai.projeto.dto.ClienteResponseDTO;
import com.senai.projeto.entity.ClienteEntity;
import com.senai.projeto.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/cliente")

public class ClienteController {
    @Autowired
    private ClienteService service;

    //    get
    @GetMapping
    public ResponseEntity<List<ClienteResponseDTO>> listar() {
        return ResponseEntity
                .ok()
                .body(service.listarTodosClientes());

    }

    //post
    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@Valid @RequestBody ClienteRequestDTO dto) {
        service.salvarClientes(dto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("Mensagem", "Cliente criado com sucesso"));


    }
}