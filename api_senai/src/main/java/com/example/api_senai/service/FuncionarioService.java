package com.example.api_senai.service;

import com.example.api_senai.entity.FuncionarioEntity;
import com.example.api_senai.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository repository;

    public List<FuncionarioEntity> listarTodosFuncionarios(){
        return repository.findAll();

    }
    public FuncionarioEntity salvarFuncionario(FuncionarioEntity funcionario){
        if (repository.findByEmail(funcionario.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Funcionario já cadastrado");
        }

        return repository.save(funcionario);
    }
}
