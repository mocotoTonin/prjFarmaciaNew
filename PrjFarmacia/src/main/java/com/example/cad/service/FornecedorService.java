package com.example.cad.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cad.entity.Fornecedor;
import com.example.cad.repository.FornecedorRepository;

@Service
public class FornecedorService {

    private final FornecedorRepository fornecedorRepository;

    @Autowired
    public FornecedorService (FornecedorRepository fornecedorRepository) {
        this.fornecedorRepository = fornecedorRepository;
    }

    public Fornecedor salvar(Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    public void deletar(int id) {
        fornecedorRepository.deleteById(id);
    }

    public Fornecedor buscarFornecedorPorId(int id) {
        return fornecedorRepository.findById(id).orElse(null);
    }

    public List<Fornecedor> buscarTodosFornecedores() {
        return fornecedorRepository.findAll();
    }

    public Fornecedor atualizarFornecedor(int id, Fornecedor fornecedorAtualizado) {
        Optional<Fornecedor> fornecedorExistente = fornecedorRepository.findById(id);
        if (fornecedorExistente.isPresent()) {
            Fornecedor fornecedor = fornecedorExistente.get();
            fornecedor.setRazaoSocial(fornecedorAtualizado.getRazaoSocial());
            fornecedor.setNomeFantasia(fornecedorAtualizado.getNomeFantasia());
            fornecedor.setCnpj(fornecedorAtualizado.getCnpj());
            fornecedor.setEndereco(fornecedorAtualizado.getEndereco());
            fornecedor.setFone(fornecedorAtualizado.getFone());
            fornecedor.setEmail(fornecedorAtualizado.getEmail());
            fornecedor.setInscricaoEstadual(fornecedorAtualizado.getInscricaoEstadual());
            return fornecedorRepository.save(fornecedor);
        } else {
            return null;
        }
    }
}

