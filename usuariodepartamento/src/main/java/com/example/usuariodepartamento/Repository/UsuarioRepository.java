package com.example.usuariodepartamento.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.usuariodepartamento.Model.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {



    
}
