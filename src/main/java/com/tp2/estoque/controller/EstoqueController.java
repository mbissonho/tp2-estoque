package com.tp2.estoque.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tp2.estoque.repository.CategoriaRepository;
import com.tp2.estoque.repository.FabricanteRepository;
import com.tp2.estoque.repository.ProdutoRepository;
import com.tp2.estoque.repository.filter.ListagemPorSaldoMinimo;

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
	public ModelAndView ListagemDeProdutos(ListagemPorSaldoMinimo filtro, Model model){
		ModelAndView mv = new ModelAndView("listagem-de-produtos.html");
		
		this.addCommons(model, mv, filtro);
		
		return mv;
	}
	
	@GetMapping("listagemPorSaldoMinimo")
	public ModelAndView listagemPorSaldoMinimo(ListagemPorSaldoMinimo filtro, Model model){
		ModelAndView mv = new ModelAndView("listagem-de-produtos.html");
		
		this.addCommons(model, mv, filtro);
		
		mv.addObject("produtos", repository.filtroPorSaldoMinimo(filtro));
				
		return mv;
	}
	
	
	private void addCommons(Model model, ModelAndView mv, ListagemPorSaldoMinimo filtro) {
		
		model.addAttribute("filtro", filtro);
		
		mv.addObject("margens", new String[] {"1", "2", "4", "8", "16", "32"});
		
		mv.addObject("produtos", repository.findAll());
		mv.addObject("categorias", categoriaRepository.findAll());
		mv.addObject("fabricantes", fabricanteRepository.findAll());
		
	}
}
