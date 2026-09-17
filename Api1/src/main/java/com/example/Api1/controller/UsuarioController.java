package com.example.Api1.controller;

import com.example.Api1.entity.UsuarioEntity;
import com.example.Api1.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;

    @GetMapping
    public List<UsuarioEntity> listarTodos(){
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar (@RequestBody UsuarioEntity usuario){
        repository.save(usuario);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("mensagem", "Tudo ok"));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> atualizar (@PathVariable Long id, @RequestBody UsuarioEntity usuario) {
        if (!repository.existsById(id)){
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(Map.of("mensagem", "usuario nao encontrado"));
    }

        usuario.setId(id);
        repository.save(usuario);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("mensagem", "usuario atualizado com sucesso"));

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> deletar (@PathVariable Long id) {
        if (!repository.existsById(id)) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(Map.of("mensagem", "usuario nao encontrado"));
        }
        repository.deleteById(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("mensagem", "usuario deletado com sucesso"));

    }



}
