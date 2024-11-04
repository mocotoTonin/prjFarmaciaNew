package com.example.cad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.cad.entity.Fornecedor;
import com.example.cad.service.FornecedorService;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {

    @Autowired
    private FornecedorService fornecedorService;

    @GetMapping
    public List<Fornecedor> listar() {
        return fornecedorService.buscarTodosFornecedores();
    }

    @PostMapping
    public Fornecedor adicionar(@RequestBody Fornecedor fornecedor) {
        return fornecedorService.salvar(fornecedor);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id) {
        fornecedorService.deletar(id);
    }

    @GetMapping("/{id}")
    public Fornecedor buscarPorId(@PathVariable int id) {
        return fornecedorService.buscarFornecedorPorId(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Fornecedor> atualizarFornecedor(@PathVariable int id, @RequestBody Fornecedor fornecedor) {
        Fornecedor fornecedorAtualizado = fornecedorService.atualizarFornecedor(id, fornecedor);
        if (fornecedorAtualizado != null) {
            return ResponseEntity.ok(fornecedorAtualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

