package com.tp2.estoque.controller.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import com.tp2.estoque.model.Categoria;

public class CategoriaConverter implements Converter<String, Categoria> {

	@Override
	public Categoria convert(String id) {
		if (!StringUtils.isEmpty(id)) {
			Categoria categoria = new Categoria();
			categoria.setId(Long.valueOf(id));
			return categoria;
		}
		
		return null;
	}
}