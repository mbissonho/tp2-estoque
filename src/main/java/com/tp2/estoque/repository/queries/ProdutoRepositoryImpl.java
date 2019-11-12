package com.tp2.estoque.repository.queries;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.tp2.estoque.model.Produto;
import com.tp2.estoque.repository.filter.ListagemPorSaldoMinimo;

public class ProdutoRepositoryImpl implements ProdutoQueries {

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public List<Produto> filtroPorSaldoMinimo(ListagemPorSaldoMinimo filtro) {		
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Produto> criteria = builder.createQuery(Produto.class);
		Root<Produto> root = criteria.from(Produto.class);
		
		Predicate[] predicates = criarRestricoes(filtro, builder, root);
		criteria.where(predicates);
		
		TypedQuery<Produto> query = manager.createQuery(criteria);
		
		return new ArrayList<>(query.getResultList());
	}
	
	private Predicate[] criarRestricoes(ListagemPorSaldoMinimo filtro, CriteriaBuilder builder, Root<Produto> root) {
		List<Predicate> predicates = new ArrayList<>();
		
		if(filtro.getMargem() != null) {
			
			Expression<Integer> saldoMinimoExp = root.get("saldoMinimo"); 
			Expression<Integer> sum = builder.sum(saldoMinimoExp, filtro.getMargem());
			
			predicates.add(
				builder.lessThanOrEqualTo(root.get("saldo"), sum)
			);
		}
		
	
		
		if(filtro.getFabricante() != null) {
			predicates.add(
				builder.equal(root.get("fabricante"), filtro.getFabricante())	
			);
		}
		
		if(filtro.getCategoria() != null) {
			predicates.add(
				builder.equal(root.get("categoria"), filtro.getCategoria())	
			);
		}
		
		return predicates.toArray(new Predicate[predicates.size()]);
	}
	
}
