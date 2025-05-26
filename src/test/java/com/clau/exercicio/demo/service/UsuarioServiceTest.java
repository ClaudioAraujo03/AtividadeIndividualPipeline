package com.clau.exercicio.demo.service;

import com.clau.exercicio.demo.Usuario;
import com.clau.exercicio.demo.UsuarioService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.List;

@ExtendWith(MockitoExtension.class)
class UsuarioServiceTest {

  @InjectMocks
  private UsuarioService service;

  @Test
  void deve_retornar_lista_usuarios() {
    List<Usuario> usuarios = service.findAll();

    assertEquals(2, usuarios.size());
  }
}
