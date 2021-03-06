package com.cursoapirest.modulos.pessoaFisica.servicos;

import com.cursoapirest.modulos.pessoaFisica.model.PessoaFisica;
import com.cursoapirest.modulos.pessoaFisica.repositorio.PessoaFisicaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cursoapirest.exception.EntidadeNotFoundException;
import java.util.List;
import java.util.Optional;


@Service
public class PessoaFisicaServicosImpl implements PessoaFisicaServicos {

  @Autowired
  PessoaFisicaRepositorio pessoaFisicaRepositorio;

  @Override
  public List<PessoaFisica> buscarTodos() {
    return pessoaFisicaRepositorio.findAll();
  }
  @Override
  public PessoaFisica buscarPorId(Long id) {
  	Optional<PessoaFisica> obj = pessoaFisicaRepositorio.findById(id);
  	
  	return obj.orElseThrow(()->new EntidadeNotFoundException("Id not found "+ id));
  }
  
  @Override
  public PessoaFisica inserir(PessoaFisica pessoaFisica) {
  	return pessoaFisicaRepositorio.save(pessoaFisica);
  }
}
