package com.example.api_senai.controller;

import com.example.api_senai.entity.FuncionarioEntity;
import com.example.api_senai.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {
    @Autowired
    private FuncionarioService service;

    @GetMapping
    public List<FuncionarioEntity> listarTodos(){
        return service.listarTodosFuncionarios();
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar (@RequestBody FuncionarioEntity funcionario){
        service.salvarFuncionario(funcionario);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("Mensagem", "Funcionario cadastrado com sucesso!"));
    }
//    @PutMapping("/{id}")
//    public ResponseEntity<Map<String, Object>> atualizar (@PathVariable Long id, @RequestBody UsuarioEntity usuario) {
//        if (!repository.existsById(id)){
//            return ResponseEntity
//                    .status(HttpStatus.NOT_FOUND)
//                    .body(Map.of("mensagem", "usuario nao encontrado"));
//        }
//
//        usuario.setId(id);
//        repository.save(usuario);
//        return ResponseEntity
//                .status(HttpStatus.OK)
//                .body(Map.of("mensagem", "usuario atualizado com sucesso"));
//
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Map<String, Object>> deletar (@PathVariable Long id) {
//        if (!repository.existsById(id)) {
//            return ResponseEntity
//                    .status(HttpStatus.NOT_FOUND)
//                    .body(Map.of("mensagem", "usuario nao encontrado"));
//        }
//        repository.deleteById(id);
//        return ResponseEntity
//                .status(HttpStatus.OK)
//                .body(Map.of("mensagem", "usuario deletado com sucesso"));
//
//    }


}
