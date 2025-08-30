package br.edu.ifs.designpatterns.decorator.impl;

import br.edu.ifs.designpatterns.decorator.Component;

public class Acucar implements Component {
	
	private Component component;
	
	public Acucar(Component component) {
		this.component = component;
	}

	@Override
	public double custo() {
		return component.custo() + 0.3;
	}

	@Override
	public String getDescricao() {
		return component.getDescricao() + ", com açúcar";
	}
}