package com.example.API.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tab_cliente")
public class ClienteEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String email;
    private String zapzap;

    public ClienteEntity() {
    }

    public ClienteEntity(Long id, String nome, String email, String zapzap) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.zapzap = zapzap;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getZapzap() {
        return zapzap;
    }

    public void setZapzap(String zapzap) {
        this.zapzap = zapzap;
    }
}
