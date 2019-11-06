package com.tp2.estoque.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tp2.estoque.model.Produto;
import com.tp2.estoque.repository.ProdutoRepository;

@Controller
@RequestMapping("/")
public class EstoqueController {

	@Autowired
	private ProdutoRepository repository;
	
	@GetMapping
	public ModelAndView ListagemDeProdutos(){
		ModelAndView mv = new ModelAndView("listagem-de-produtos.html");
		
		List<Produto> produtos = new ArrayList<Produto>();
		
		produtos.addAll((Collection<? extends Produto>) this.repository.findAll());

		mv.addObject("produtos", produtos);
		
		return mv;
	}
	
}
