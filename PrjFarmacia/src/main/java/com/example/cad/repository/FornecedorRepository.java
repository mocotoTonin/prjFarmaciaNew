package com.example.cad.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.cad.entity.Fornecedor;

import org.springframework.stereotype.Repository;

@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Integer> {
}

