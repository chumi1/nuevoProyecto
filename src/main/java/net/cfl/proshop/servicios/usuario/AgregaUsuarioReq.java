package net.cfl.proshop.servicios.usuario;

import lombok.Data;

@Data
public class AgregaUsuarioReq {
private String usuarioNombre;
private String usuarioApellido;
private String email;
private String pwd;
}
