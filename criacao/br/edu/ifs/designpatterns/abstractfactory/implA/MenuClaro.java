package br.edu.ifs.designpatterns.abstractfactory.implA;

import br.edu.ifs.designpatterns.abstractfactory.Menu;

public class MenuClaro implements Menu {
    
    @Override
    public String obterCor() {
        return "#FFFAFA";
    }
}