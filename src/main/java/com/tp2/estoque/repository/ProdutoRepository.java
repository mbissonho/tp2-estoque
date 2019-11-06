package com.tp2.estoque.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tp2.estoque.model.Categoria;
import com.tp2.estoque.model.Fabricante;
import com.tp2.estoque.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	List<Produto> findByFabricante(Fabricante fabricante);
	List<Produto> findByCategoria(Categoria categoria);
		
	
}
