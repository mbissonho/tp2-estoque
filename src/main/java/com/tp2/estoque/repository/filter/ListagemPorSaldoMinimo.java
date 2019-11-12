package com.tp2.estoque.repository.filter;

import com.tp2.estoque.model.Categoria;
import com.tp2.estoque.model.Fabricante;

public class ListagemPorSaldoMinimo {

	private Integer margem;
	private Fabricante fabricante;
	private Categoria categoria;
	
	public Integer getMargem() {
		return margem;
	}
	public void setMargem(Integer margem) {
		this.margem = margem;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
}
