package com.example.cad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cad.entity.Drogaria;

@Repository
public interface DrogariaRepository extends JpaRepository<Drogaria, Long> {
}

