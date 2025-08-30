package br.edu.ifs.designpatterns.builder.impl;

import br.edu.ifs.designpatterns.builder.Construtor;

public class ConstrutorComputador implements Construtor {
	
	private Computador computador;
	
	public ConstrutorComputador() {
		this.computador = new Computador();
	}

	@Override
	public void definirProcessador(String processador) {
		this.computador.setProcessador(processador);
	}

	@Override
	public void definirHD(int hd) {
		this.computador.setHD(hd);
	}

	@Override
	public void definirRAM(int ram) {
		this.computador.setRAM(ram);
	}

	@Override
	public Computador obterComputador() {
		Computador resultado = this.computador;
		this.computador = new Computador();
		return resultado;
	}
}