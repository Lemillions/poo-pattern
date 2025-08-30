package br.edu.ifs.designpatterns.interpreter.conditional;

import br.edu.ifs.designpatterns.interpreter.Expressao;
import br.edu.ifs.designpatterns.interpreter.relational.ExpressaoRelacional;

public class ExpressaoCondicional implements Expressao {
    private ExpressaoRelacional<?> condicao;
    private Expressao entao;
    
    public ExpressaoCondicional(ExpressaoRelacional<?> condicao, Expressao entao) {
        this.condicao = condicao;
        this.entao = entao;
    }
    
    @Override
    public void interpretar() {
        if (condicao.avaliar()) {
            entao.interpretar();
        }
    }
    
    @Override
    public String toString() {
        return "se " + condicao.toString() + " então:\n" + entao.toString();
    }
}