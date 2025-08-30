package br.edu.ifs.designpatterns.builder.impl;

public class Computador {
	
	private String processador;
	private int hd;
	private int ram;
	
	public Computador() {
	}

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

	public int getHD() {
		return hd;
	}

	public void setHD(int hd) {
		this.hd = hd;
	}

	public int getRAM() {
		return ram;
	}

	public void setRAM(int ram) {
		this.ram = ram;
	}
}