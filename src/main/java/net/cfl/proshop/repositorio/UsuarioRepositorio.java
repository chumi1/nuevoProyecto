package net.cfl.proshop.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import net.cfl.proshop.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario,Long> {

}
