package com.tp2.estoque.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tp2.estoque.repository.CategoriaRepository;
import com.tp2.estoque.repository.FabricanteRepository;
import com.tp2.estoque.repository.ProdutoRepository;

@Controller
@RequestMapping("/")
public class EstoqueController {

	@Autowired
	private ProdutoRepository repository;
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private FabricanteRepository fabricanteRepository;
	
	@GetMapping
	public ModelAndView ListagemDeProdutos(){
		ModelAndView mv = new ModelAndView("listagem-de-produtos.html");
		mv.addObject("produtos", repository.findAll());
		mv.addObject("categorias", categoriaRepository.findAll());
		mv.addObject("fabricantes", fabricanteRepository.findAll());
		return mv;
	}
	
	@GetMapping("listagemPorSaldoMinimo")
	public ModelAndView listagemPorSaldoMinimo(@PathParam(value = "fabricante") String fabricante){
		ModelAndView mv = new ModelAndView("listagem-de-produtos.html");
		
		
		mv.addObject("categorias", categoriaRepository.findAll());
		mv.addObject("fabricantes", fabricanteRepository.findAll());
		
		mv.addObject("produtos", repository.findAll());
				
		return mv;
	}
	
}
