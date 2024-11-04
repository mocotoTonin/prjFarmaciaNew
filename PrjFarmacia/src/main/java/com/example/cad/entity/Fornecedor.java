package com.example.cad.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
@Entity
@Table
public class Fornecedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
    @NotNull
    @Size(min=10,message="minimo de 10 caracteres")
    private String razaoSocial;
    @NotNull
    @Size(min=10,message="minimo de 10 caracteres")
    private String nomeFantasia;
    @NotNull
    @Size(min=14,message="minimo de 14 caracteres")
    private String cnpj;
    @NotNull
    @Size(min=12,message="minimo de 12 caracteres")
    private String endereco;
    @NotNull
    @Size(min=9,message="minimo de 9 caracteres")
    private String fone;
    @NotNull
    @Size(min=15,message="minimo de 15 caracteres")
    private String email;
    @NotNull
    @Size(min=10,message="minimo de 10 caracteres")
    private String inscricaoEstadual;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
}