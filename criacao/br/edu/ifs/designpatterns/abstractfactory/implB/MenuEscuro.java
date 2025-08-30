package br.edu.ifs.designpatterns.abstractfactory.implB;

import br.edu.ifs.designpatterns.abstractfactory.Menu;

public class MenuEscuro implements Menu {
    
    @Override
    public String obterCor() {
        return "#4F4F4F";
    }
}