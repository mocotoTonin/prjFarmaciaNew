package com.example.cad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.cad.entity.Drogaria;
import com.example.cad.service.DrogariaService;

import java.util.List;

@RestController
@RequestMapping("/drogarias")
public class DrogariaController {

    @Autowired
    private DrogariaService drogariaServices;

    @GetMapping
    public List<Drogaria> listar() {
        return drogariaServices.buscarTodasDrogarias();
    }

    @PostMapping
    public Drogaria adicionar(@RequestBody Drogaria drogaria) {
        return drogariaServices.salvar(drogaria);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        drogariaServices.deletar(id);
    }

    @GetMapping("/{id}")
    public Drogaria buscarPorId(@PathVariable Long id) {
        return drogariaServices.buscarDrogariaPorId(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Drogaria> atualizarDrogaria(@PathVariable Long id, @RequestBody Drogaria drogaria) {
        Drogaria drogariaAtualizada = drogariaServices.atualizarDrogaria(id, drogaria);
        if (drogariaAtualizada != null) {
            return ResponseEntity.ok(drogariaAtualizada);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
