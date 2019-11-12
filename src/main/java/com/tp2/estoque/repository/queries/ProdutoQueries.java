package com.tp2.estoque.repository.queries;

import java.util.List;

import com.tp2.estoque.model.Produto;
import com.tp2.estoque.repository.filter.ListagemPorSaldoMinimo;

public interface ProdutoQueries {

	public List<Produto> filtroPorSaldoMinimo(ListagemPorSaldoMinimo filtro);
	
}
