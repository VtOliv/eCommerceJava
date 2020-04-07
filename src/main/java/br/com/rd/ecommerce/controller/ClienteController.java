package br.com.rd.ecommerce.controller;

import br.com.rd.ecommerce.model.dto.ClienteDTO;
import br.com.rd.ecommerce.model.entity.Cliente;
import br.com.rd.ecommerce.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
    @Autowired
    ClienteService service;

    @PostMapping("cadastrar-cliente")
    public ResponseEntity criarCliente(@RequestBody ClienteDTO clienteDTO){
        return service.criarCliente(clienteDTO);
    }
    @PostMapping("login-cliente")
    public ResponseEntity realizarLogin(@RequestBody String[] dados){
        return service.fazerLogin(dados[0], dados[1]);
    }
    @PatchMapping("enviar-codigo")
    public ResponseEntity enviarCodigo(@RequestBody String[] dados){
        return service.recuperarSenha(dados[0]);
    }
    @PatchMapping("redefinir-senha")
    public ResponseEntity redefinirSenha(@RequestBody String[] dados){
        return service.redefinirSenha(dados);
    }
}
