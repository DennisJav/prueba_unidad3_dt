package com.uce.ec.repository;

import java.util.List;

import com.uce.ec.modelo.Venta;

public interface IVentaRepo {

	void insertarVenta(Venta venta);
	List<Venta> buscarFechaVenta(String fechaVenta);
}
