package br.edu.ifs.designpatterns.observer.impl;

import java.util.ArrayList;
import java.util.List;

public class Produto {
	
	private String nome;
	private int quantidade;
	private List<Cliente> observadores;
	
	public Produto(String nome) {
		this.nome = nome;
		this.quantidade = 0;
		this.observadores = new ArrayList<>();
	}
	
	public boolean estaDisponivel() {
		return quantidade > 0;
	}
	
	public void inscrever(Cliente cliente) {
		observadores.add(cliente);
	}
	
	public void adicionar(int quantidadeAdicionar) {
		this.quantidade += quantidadeAdicionar;
		notificarObservadores();
	}
	
	public void comprarUm() {
		if (quantidade > 0) {
			quantidade--;
		}
	}
	
	private void notificarObservadores() {
		List<Cliente> observadoresCopia = new ArrayList<>(observadores);
		for (Cliente cliente : observadoresCopia) {
			cliente.notificar(this);
		}
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public String getNome() {
		return nome;
	}
}