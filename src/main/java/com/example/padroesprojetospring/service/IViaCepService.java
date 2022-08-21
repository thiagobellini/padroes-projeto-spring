package com.example.padroesprojetospring.service;

import com.example.padroesprojetospring.model.Cliente;
import com.example.padroesprojetospring.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface IViaCepService {
    @GetMapping(value = "/{cep}/json")
    Endereco consultarCep(@PathVariable("cep") String cep);
}
