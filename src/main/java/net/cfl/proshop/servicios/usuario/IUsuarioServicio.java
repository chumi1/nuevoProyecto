package net.cfl.proshop.servicios.usuario;

import net.cfl.proshop.Usuario;

public interface IUsuarioServicio {
	Usuario traeUsuarioPorId(Long usuarioId);
	Usuario crearUsuario(AgregaUsuarioReq request);
	Usuario actualizaUsuario(ActualizaUsuarioReq request, Long usuarioId);
	void borrarUsuario(Long usuarioId);

}
