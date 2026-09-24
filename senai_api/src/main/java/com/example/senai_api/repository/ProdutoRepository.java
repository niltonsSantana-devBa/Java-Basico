package com.example.senai_api.repository;

import com.example.senai_api.entity.ProdutosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutosEntity, Long> {
    Optional<ProdutosEntity> findByNome(String nome);
}
