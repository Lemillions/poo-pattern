package br.edu.ifs.designpatterns.abstractfactory.implB;

import br.edu.ifs.designpatterns.abstractfactory.Botao;

public class BotaoEscuro implements Botao {
    
    @Override
    public String obterCor() {
        return "#4F4F4F";
    }
}