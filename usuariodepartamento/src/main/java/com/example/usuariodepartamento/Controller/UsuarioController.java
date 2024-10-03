package com.example.usuariodepartamento.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.usuariodepartamento.Model.Usuario;
import com.example.usuariodepartamento.Repository.UsuarioRepository;

@RestController
@RequestMapping(value = "/usuarios")

public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public List<Usuario> buscarTodosUsuarios() {
        List<Usuario> resultado = usuarioRepository.findAll();
        return resultado;
    }

    @GetMapping(value = "/{id}")
    public Usuario buscarUsuarioPorId(@PathVariable Long id) {
        Usuario resultado = usuarioRepository.findById(id).get();
        return resultado;
    }

    @PostMapping
    public Usuario AdicionarUsuario(@RequestBody Usuario usuario) {
        Usuario resultado = usuarioRepository.save(usuario);
        return resultado;
    }
    
}
