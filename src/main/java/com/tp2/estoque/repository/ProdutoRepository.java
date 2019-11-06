package com.tp2.estoque.repository;

import org.springframework.data.repository.CrudRepository;

import com.tp2.estoque.model.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Long> {

}
