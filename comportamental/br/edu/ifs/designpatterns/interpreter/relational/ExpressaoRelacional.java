package br.edu.ifs.designpatterns.interpreter.relational;

import br.edu.ifs.designpatterns.interpreter.terminal.Variavel;

public abstract class ExpressaoRelacional<T extends Comparable<T>> {
    protected Variavel<T> esquerda;
    protected Variavel<T> direita;
    
    public ExpressaoRelacional(Variavel<T> esquerda, Variavel<T> direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }
    
    public abstract boolean avaliar();
}