package com.example.senai_api.service;


import com.example.senai_api.entity.ProdutosEntity;
import com.example.senai_api.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired

    private ProdutoRepository repository;

    public List<ProdutosEntity> ListarTodosProdutos (){
        return repository.findAll();
    }

    public ProdutosEntity salvarProduto (ProdutosEntity produtos){
        if (repository.findByNome(produtos.getNome()).isPresent())
            throw new IllegalArgumentException("Produto já cadastrado");

        return repository.save(produtos);
    }

    public ProdutosEntity atualizarProduto ( Long id ,ProdutosEntity produtos){
        if (!repository.existsById(id))
            throw new IllegalArgumentException("Produto não encontrado");

        produtos.setId(id);
        return repository.save(produtos);
    }

    public void excluirProduto (Long id) {
        if (!repository.existsById(id)) {
            throw new IllegalArgumentException("Produto não encontrado");
        }

        repository.deleteById(id);
    }


}
