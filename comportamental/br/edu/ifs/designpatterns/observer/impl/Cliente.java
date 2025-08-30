package br.edu.ifs.designpatterns.observer.impl;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private String nome;
	private List<String> pedidos;
	
	public Cliente(String nome) {
		this.nome = nome;
		this.pedidos = new ArrayList<>();
	}
	
	public void comprar(Produto produto) {
		if (!produto.estaDisponivel()) {
			throw new IllegalStateException("Produto indisponível");
		}
		produto.comprarUm();
		pedidos.add(produto.getNome());
	}
	
	public void notificar(Produto produto) {
		comprar(produto);
	}
	
	public List<String> getPedidos() {
		return pedidos;
	}
	
	public String getNome() {
		return nome;
	}
}