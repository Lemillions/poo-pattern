package br.edu.ifs.designpatterns.proxy.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import br.edu.ifs.designpatterns.proxy.Arquivo;

public class ArquivoReal implements Arquivo {
	
	private String nome;
	
	public ArquivoReal(String nome) {
		this.nome = nome;
	}
	
	@Override
	public void criar() {
		try {
			Path path = Path.of(nome);
			if (!Files.exists(path)) {
				Files.createFile(path);
			}
		} catch (IOException e) {
			throw new RuntimeException("Erro ao criar arquivo", e);
		}
	}
	
	@Override
	public void escrever(String texto) {
		try {
			Path path = Path.of(nome);
			if (Files.exists(path)) {
				Files.write(path, (texto + "\n").getBytes(), 
						StandardOpenOption.APPEND);
			} else {
				Files.write(path, texto.getBytes());
			}
		} catch (IOException e) {
			throw new RuntimeException("Erro ao escrever arquivo", e);
		}
	}
	
	@Override
	public String recuperar() {
		try {
			Path path = Path.of(nome);
			if (Files.exists(path)) {
				String content = Files.readString(path);
				if (content.endsWith("\n")) {
					content = content.substring(0, content.length() - 1);
				}
				return content;
			}
			return "";
		} catch (IOException e) {
			throw new RuntimeException("Erro ao ler arquivo", e);
		}
	}
	
	@Override
	public void remover() {
		try {
			Path path = Path.of(nome);
			if (Files.exists(path)) {
				Files.delete(path);
			}
		} catch (IOException e) {
			throw new RuntimeException("Erro ao remover arquivo", e);
		}
	}
}