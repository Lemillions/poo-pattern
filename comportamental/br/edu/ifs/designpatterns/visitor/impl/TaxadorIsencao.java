package br.edu.ifs.designpatterns.visitor.impl;

import br.edu.ifs.designpatterns.visitor.Taxador;

public class TaxadorIsencao implements Taxador {
    
    @Override
    public double taxar(Alimento alimento) {
        return alimento.getCusto();
    }
    
    @Override
    public double taxar(Cerveja cerveja) {
        return cerveja.getCusto() * 1.15;
    }
    
    @Override
    public double taxar(Cigarro cigarro) {
        return cigarro.getCusto() * 2.50;
    }
    
    @Override
    public double taxar(Vinho vinho) {
        return vinho.getCusto() * 1.20;
    }
}