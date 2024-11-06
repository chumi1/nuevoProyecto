package net.cfl.proshop.servicios.usuario;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import net.cfl.proshop.Usuario;
import net.cfl.proshop.excepciones.RecursoNoEncontradoEx;
import net.cfl.proshop.repositorio.UsuarioRepositorio;
@Service
@RequiredArgsConstructor
public class UsuarioServicio implements IUsuarioServicio{
	private final UsuarioRepositorio usuarioRepositorio;

	@Override
	public Usuario traeUsuarioPorId(Long usuarioId) {
		return usuarioRepositorio.findById(usuarioId)
				.orElseThrow(() -> new RecursoNoEncontradoEx("usuario no encontrado"));
		
	}

	@Override
	public Usuario crearUsuario(AgregaUsuarioReq request) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void borrarUsuario(Long usuarioId) {
		usuarioRepositorio.findById(usuarioId)
		.ifPresentOrElse(usuarioRepositorio :: delete, () ->{
			throw new RecursoNoEncontradoEx("usuario no encontrado");
		});;
		
	}

	@Override
	public Usuario actualizaUsuario(ActualizaUsuarioReq request, Long usuarioId) {
		return usuarioRepositorio.findById(usuarioId).map(usuarioExistente ->{
			usuarioExistente.setUsuarioNombre(request.getUsuarioNombre());
			usuarioExistente.setUsuarioApellido(request.getUsuarioApellido());
			return usuarioRepositorio.save(usuarioExistente);
		}).orElseThrow(() -> new RecursoNoEncontradoEx("usuario no encontrado")) ;
	}

}
