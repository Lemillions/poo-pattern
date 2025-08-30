package br.edu.ifs.designpatterns.chain.impl;

import br.edu.ifs.designpatterns.chain.Analisador;

public class AnalistaRisco extends Analisador {
    
    @Override
    public Emprestimo processarRequisição(RequisicaoEmprestimo requisicao) {
        if (requisicao.getScoreCredito() < 700) {
            throw new IllegalStateException("Analista de risco: Reprovado! Score de crédito baixo.");
        }
        
        if (sucessor != null) {
            return sucessor.processarRequisição(requisicao);
        }
        
        return new Emprestimo(requisicao.getValor());
    }
}