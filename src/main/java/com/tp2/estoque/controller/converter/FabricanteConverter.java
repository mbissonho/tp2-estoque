package com.tp2.estoque.controller.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import com.tp2.estoque.model.Fabricante;

public class FabricanteConverter implements Converter<String, Fabricante> {

	@Override
	public Fabricante convert(String id) {
		if (!StringUtils.isEmpty(id)) {
			Fabricante fabricante = new Fabricante();
			fabricante.setId(Long.valueOf(id));
			return fabricante;
		}
		
		return null;
	}
}
