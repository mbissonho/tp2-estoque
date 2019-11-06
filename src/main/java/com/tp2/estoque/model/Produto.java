package com.tp2.estoque.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	@JoinColumn(name = "categoria_id")
	@ManyToOne
	private Categoria categoria;
	
	@JoinColumn(name = "fabricante_id")
	@ManyToOne
	private Fabricante fabricante;
	
	private Integer saldo;
	
	private Integer saldoMinimo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public Integer getSaldo() {
		return saldo;
	}

	public void setSaldo(Integer saldo) {
		this.saldo = saldo;
	}

	public Integer getSaldoMinimo() {
		return saldoMinimo;
	}

	public void setSaldoMinimo(Integer saldoMinimo) {
		this.saldoMinimo = saldoMinimo;
	}
	
}
