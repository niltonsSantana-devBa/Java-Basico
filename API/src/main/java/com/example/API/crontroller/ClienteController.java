package com.example.API.crontroller;

import com.example.API.entity.ClienteEntity;
import com.example.API.repository.ClienteRepository;
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
    private ClienteRepository repository;

    @GetMapping
    public List<ClienteEntity> listaTodos(){
        return repository.findAll();
    }
    @PostMapping
    public ResponseEntity<Map<String,Object>> salvar (@RequestBody ClienteEntity cliente) {
        repository.save(cliente);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("mensagem", "Deu certo"));

    }
}
