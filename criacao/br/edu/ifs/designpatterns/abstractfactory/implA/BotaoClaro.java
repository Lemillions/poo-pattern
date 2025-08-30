package br.edu.ifs.designpatterns.abstractfactory.implA;

import br.edu.ifs.designpatterns.abstractfactory.Botao;

public class BotaoClaro implements Botao {
    
    @Override
    public String obterCor() {
        return "#FFFAFA";
    }
}