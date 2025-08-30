package br.edu.ifs.designpatterns.template.impl;

import java.util.List;
import br.edu.ifs.designpatterns.template.Bebida;

public class Cafe extends Bebida {
    
    @Override
    protected void adicionarIngredientes(List<String> preparo) {
        preparo.add("Adicionar uma colher de café");
    }
}