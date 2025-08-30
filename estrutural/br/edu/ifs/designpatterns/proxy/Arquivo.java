package br.edu.ifs.designpatterns.proxy;

public interface Arquivo {
	
	void criar();
	
	void escrever(String texto);
	
	String recuperar();
	
	void remover();
}