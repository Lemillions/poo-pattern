package br.edu.ifs.designpatterns.builder;

import br.edu.ifs.designpatterns.builder.impl.Computador;

public interface Construtor {
	
	void definirProcessador(String processador);
	
	void definirHD(int hd);
	
	void definirRAM(int ram);
	
	Computador obterComputador();
}