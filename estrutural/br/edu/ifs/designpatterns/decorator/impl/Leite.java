package br.edu.ifs.designpatterns.decorator.impl;

import br.edu.ifs.designpatterns.decorator.Component;

public class Leite implements Component {
	
	private Component component;
	
	public Leite(Component component) {
		this.component = component;
	}

	@Override
	public double custo() {
		return component.custo() + 0.5;
	}

	@Override
	public String getDescricao() {
		return component.getDescricao() + ", com leite";
	}
}