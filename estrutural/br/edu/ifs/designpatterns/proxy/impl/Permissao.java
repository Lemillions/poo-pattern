package br.edu.ifs.designpatterns.proxy.impl;

public class Permissao {
	
	private boolean leitura;
	private boolean escrita;
	
	public Permissao(boolean leitura, boolean escrita) {
		this.leitura = leitura;
		this.escrita = escrita;
	}
	
	public boolean temLeitura() {
		return leitura;
	}
	
	public boolean temEscrita() {
		return escrita;
	}
}