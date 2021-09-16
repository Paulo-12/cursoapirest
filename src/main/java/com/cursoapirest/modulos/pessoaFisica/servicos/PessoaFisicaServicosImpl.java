package com.cursoapirest.modulos.pessoaFisica.servicos;

import com.cursoapirest.modulos.pessoaFisica.model.PessoaFisica;
import com.cursoapirest.modulos.pessoaFisica.repositorio.PessoaFisicaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaFisicaServicosImpl implements PessoaFisicaServicos {

  @Autowired
  PessoaFisicaRepositorio pessoaFisicaRepositorio;

  @Override
  public List<PessoaFisica> buscarTodos() {
    return pessoaFisicaRepositorio.findAll();
  }
}
