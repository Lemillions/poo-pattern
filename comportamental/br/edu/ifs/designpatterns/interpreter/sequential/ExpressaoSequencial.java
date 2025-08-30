package br.edu.ifs.designpatterns.interpreter.sequential;

import java.util.ArrayList;
import java.util.List;
import br.edu.ifs.designpatterns.interpreter.Expressao;

public class ExpressaoSequencial implements Expressao {
    private List<Expressao> expressoes = new ArrayList<>();
    
    public void addExpressao(Expressao expressao) {
        expressoes.add(expressao);
    }
    
    @Override
    public void interpretar() {
        for (Expressao expressao : expressoes) {
            expressao.interpretar();
        }
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("execute:\n");
        for (Expressao expressao : expressoes) {
            sb.append(expressao.toString());
        }
        return sb.toString();
    }
}