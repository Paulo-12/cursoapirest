package com.cursoapirest.modulos.pessoaFisica.repositorio;

import com.cursoapirest.modulos.pessoaFisica.model.PessoaFisica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaFisicaRepositorio
  extends JpaRepository<PessoaFisica, Long> {}
