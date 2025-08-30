package br.edu.ifs.designpatterns.abstractfactory.implA;

import br.edu.ifs.designpatterns.abstractfactory.Janela;

public class JanelaClara implements Janela {
    
    @Override
    public String obterCor() {
        return "#FFFAFA";
    }
}