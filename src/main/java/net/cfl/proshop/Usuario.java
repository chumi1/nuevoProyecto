package net.cfl.proshop;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.cfl.proshop.modelo.Carrito;
import net.cfl.proshop.modelo.Orden;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String usuarioNombre;
	private String usuarioApellido;
	private String email;
	private String pwd;
	
	@OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true )
	private Carrito carrito;
	
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true )
	private List<Orden> ordenes;
	
}
