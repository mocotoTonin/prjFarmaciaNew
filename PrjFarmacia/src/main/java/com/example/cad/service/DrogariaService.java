package com.example.cad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cad.entity.Drogaria;
import com.example.cad.repository.DrogariaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DrogariaService {

    private final DrogariaRepository drogariaRepository;

    @Autowired
    public DrogariaService (DrogariaRepository drogariaRepository) {
        this.drogariaRepository = drogariaRepository;
    }

    public Drogaria salvar(Drogaria drogaria) {
        return drogariaRepository.save(drogaria);
    }

    public void deletar(Long id) {
        drogariaRepository.deleteById(id);
    }

    public Drogaria buscarDrogariaPorId(Long id) {
        return drogariaRepository.findById(id).orElse(null);
    }

    public List<Drogaria> buscarTodasDrogarias() {
        return drogariaRepository.findAll();
    }

    public Drogaria atualizarDrogaria(Long id, Drogaria drogariaAtualizada) {
        Optional<Drogaria> drogariaExistente = drogariaRepository.findById(id);
        if (drogariaExistente.isPresent()) {
            Drogaria drogaria = drogariaExistente.get();
            drogaria.setNome(drogariaAtualizada.getNome());
            drogaria.setCnpj(drogariaAtualizada.getCnpj());
            return drogariaRepository.save(drogaria);
        } else {
            return null;
        }
    }
}
