package br.edu.ifs.designpatterns.adapter.impl;

import java.util.HashMap;
import java.util.Map;

import br.edu.ifs.designpatterns.adapter.Repositorio;
import br.edu.ifs.designpatterns.adapter.RepositorioString;

public class AdaptadorString implements Repositorio {

	private RepositorioString repositorioString;

	public AdaptadorString(RepositorioString repositorioString) {
		this.repositorioString = repositorioString;
	}

	@Override
	public Map<String, String> obterAlunos() {
		Map<String, String> alunos = new HashMap<>();
		String dados = repositorioString.recuperarDados();
		
		if (dados != null && !dados.isEmpty()) {
			String[] linhas = dados.split(";");
			
			for (String linha : linhas) {
				String[] partes = linha.split("\\t");
				if (partes.length >= 2) {
					alunos.put(partes[0], partes[1]);
				}
			}
		}
		
		return alunos;
	}
}