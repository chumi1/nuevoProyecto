package net.cfl.proshop.respuesta;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ApiRespuesta {
	private String mensaje;
	private Object data;
}