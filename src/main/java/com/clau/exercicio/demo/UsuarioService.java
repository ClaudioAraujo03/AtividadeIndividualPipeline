package com.clau.exercicio.demo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

  public UsuarioService() {
  }

  public List<Usuario> findAll(){

    return List.of(
            new Usuario(
                    1L, "Cláudio", "claudio@gmail.com"
            ),
            new Usuario(
                    2L, "Cláudio 2", "claudio2@gmail.com"
            )
    );
  }
}
