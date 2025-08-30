package br.edu.ifs.designpatterns.factorymethod;

import br.edu.ifs.designpatterns.factorymethod.impl.Anao;
import br.edu.ifs.designpatterns.factorymethod.impl.Elfo;
import br.edu.ifs.designpatterns.factorymethod.impl.Humano;
import br.edu.ifs.designpatterns.factorymethod.impl.Orc;

public class FabricaPersonagens {

	public static Personagem criarPersonagem(String tipo) {
		switch (tipo.toLowerCase()) {
			case "orc":
				return new Orc();
			case "anão":
				return new Anao();
			case "elfo":
				return new Elfo();
			case "humano":
				return new Humano();
			default:
				throw new IllegalStateException("Personagem não encontrado!");
		}
	}
}