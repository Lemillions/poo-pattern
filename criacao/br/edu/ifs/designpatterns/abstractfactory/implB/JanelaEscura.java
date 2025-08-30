package br.edu.ifs.designpatterns.abstractfactory.implB;

import br.edu.ifs.designpatterns.abstractfactory.Janela;

public class JanelaEscura implements Janela {
    
    @Override
    public String obterCor() {
        return "#4F4F4F";
    }
}