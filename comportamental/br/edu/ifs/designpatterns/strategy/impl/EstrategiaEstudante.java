package br.edu.ifs.designpatterns.strategy.impl;

import br.edu.ifs.designpatterns.strategy.EstrategiaDesconto;

public class EstrategiaEstudante implements EstrategiaDesconto {
    
    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.5;
    }
}