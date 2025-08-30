package br.edu.ifs.designpatterns.adapter.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.edu.ifs.designpatterns.adapter.Repositorio;
import br.edu.ifs.designpatterns.adapter.RepositorioLista;

public class AdaptadorLista implements Repositorio {

	private RepositorioLista repositorioLista;

	public AdaptadorLista(RepositorioLista repositorioLista) {
		this.repositorioLista = repositorioLista;
	}

	@Override
	public Map<String, String> obterAlunos() {
		Map<String, String> alunos = new HashMap<>();
		List<String> dados = repositorioLista.recuperarDados();
		
		if (dados != null) {
			for (String linha : dados) {
				String[] partes = linha.split("\\t");
				if (partes.length >= 2) {
					alunos.put(partes[0], partes[1]);
				}
			}
		}
		
		return alunos;
	}
}