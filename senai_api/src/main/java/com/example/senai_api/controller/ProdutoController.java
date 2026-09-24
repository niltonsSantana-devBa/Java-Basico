package com.example.senai_api.controller;


import com.example.senai_api.entity.ProdutosEntity;
import com.example.senai_api.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired

    private ProdutoService service;

    @GetMapping
    public List<ProdutosEntity> ListarTodos(){
        return service.ListarTodosProdutos();
    }
    @PostMapping
    public ResponseEntity<Map<String, String>> salvar (@RequestBody ProdutosEntity produtos){
        service.salvarProduto(produtos);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("Mensagem", "Produto cadastrado com sucesso"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String,String>> atualizar (@PathVariable Long id, @RequestBody ProdutosEntity produtos) {
        service.atualizarProduto(id,produtos);{
            return ResponseEntity
                    .status(HttpStatus.OK)
                   .body(Map.of("Mensagem", "Produto atualizado com sucesso"));
        }

    }

   @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, String>> deletar (@PathVariable Long id) {
         service.excluirProduto(id); {
           return ResponseEntity
                    .status(HttpStatus.OK)
                   .body(Map.of("Mensagem", "Produto excluido com sucesso"));
       }

    }

}
