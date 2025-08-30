package br.edu.ifs.designpatterns.strategy.impl;

import br.edu.ifs.designpatterns.strategy.EstrategiaDesconto;

public class EstrategiaDiaPais implements EstrategiaDesconto {
    
    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.4;
    }
}