package net.cfl.proshop.dto;

import java.sql.Blob;

import lombok.Data;

@Data
public class ImagenDto {
	private Long imagenId;
	private String imagenNombre;
	private String descargaUrl;
}
