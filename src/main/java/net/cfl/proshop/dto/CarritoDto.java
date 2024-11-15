package net.cfl.proshop.dto;

import java.math.BigDecimal;
import java.util.Set;

import lombok.Data;

@Data
public class CarritoDto {
	private Long Id;
	private BigDecimal costoTotal;
	private Set<CarritoItemDto> carritoItems;
	
}
