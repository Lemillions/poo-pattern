package br.edu.ifs.designpatterns.proxy.impl;

import br.edu.ifs.designpatterns.proxy.Arquivo;

public class ArquivoProxy implements Arquivo {
	
	private ArquivoReal arquivoReal;
	private Permissao permissao;
	
	public ArquivoProxy(String nome, Permissao permissao) {
		this.arquivoReal = new ArquivoReal(nome);
		this.permissao = permissao;
	}
	
	@Override
	public void criar() {
		if (!permissao.temEscrita()) {
			throw new IllegalStateException("Acesso negado!");
		}
		arquivoReal.criar();
	}
	
	@Override
	public void escrever(String texto) {
		if (!permissao.temEscrita()) {
			throw new IllegalStateException("Acesso negado!");
		}
		arquivoReal.escrever(texto);
	}
	
	@Override
	public String recuperar() {
		if (!permissao.temLeitura()) {
			throw new IllegalStateException("Acesso negado!");
		}
		return arquivoReal.recuperar();
	}
	
	@Override
	public void remover() {
		if (!permissao.temEscrita()) {
			throw new IllegalStateException("Acesso negado!");
		}
		arquivoReal.remover();
	}
}