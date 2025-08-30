package br.edu.ifs.designpatterns.builder;

import br.edu.ifs.designpatterns.builder.impl.Computador;
import br.edu.ifs.designpatterns.builder.impl.ConstrutorComputador;

public class Loja {
	
	private ConstrutorComputador construtor;
	
	public Loja(ConstrutorComputador construtor) {
		this.construtor = construtor;
	}
	
	public Computador construirNotebook() {
		construtor.definirProcessador("Core™ i7-1355U");
		construtor.definirHD(512);
		construtor.definirRAM(16);
		return construtor.obterComputador();
	}
	
	public Computador construirNotebookGamer() {
		construtor.definirProcessador("Core i7-13650HX");
		construtor.definirHD(1024);
		construtor.definirRAM(16);
		return construtor.obterComputador();
	}
	
	public Computador construirNotebookUltra() {
		construtor.definirProcessador("Core Ultra 7 155H");
		construtor.definirHD(1024);
		construtor.definirRAM(32);
		return construtor.obterComputador();
	}
}