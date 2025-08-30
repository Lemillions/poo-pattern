package br.edu.ifs.designpatterns.interpreter.relational;

import br.edu.ifs.designpatterns.interpreter.terminal.Variavel;

public class ExpressaoMaior<T extends Comparable<T>> extends ExpressaoRelacional<T> {
    
    public ExpressaoMaior(Variavel<T> esquerda, Variavel<T> direita) {
        super(esquerda, direita);
    }
    
    @Override
    public boolean avaliar() {
        return esquerda.getValor().compareTo(direita.getValor()) > 0;
    }
    
    @Override
    public String toString() {
        return esquerda.toString() + " maior do que " + direita.toString();
    }
}