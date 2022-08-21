package com.example.padroesprojetospring.service;

import com.example.padroesprojetospring.model.Cliente;

public interface IClienteService {
    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);
}
