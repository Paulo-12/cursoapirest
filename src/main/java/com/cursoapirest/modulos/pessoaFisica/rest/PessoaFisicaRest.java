package com.cursoapirest.modulos.pessoaFisica.rest;

import com.cursoapirest.modulos.pessoaFisica.model.PessoaFisica;
import com.cursoapirest.modulos.pessoaFisica.servicos.PessoaFisicaServicos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pessoafisica")
public class PessoaFisicaRest implements PessoaFisicaApi {

  @Autowired
  PessoaFisicaServicos pessoaFisicaServicos;

  @GetMapping
  public ResponseEntity<List<PessoaFisica>> ListarPessoas() {
    List<PessoaFisica> list = pessoaFisicaServicos.buscarTodos();
    return ResponseEntity.ok().body(list);
  }
}
