package br.edu.ifs.designpatterns.chain.impl;

import br.edu.ifs.designpatterns.chain.Analisador;

public class AnalistaCredito extends Analisador {
    
    @Override
    public Emprestimo processarRequisição(RequisicaoEmprestimo requisicao) {
        if (requisicao.getValor() > requisicao.getRenda() * 0.3) {
            throw new IllegalStateException("Analista de crédito: Reprovado! Renda insuficiente.");
        }
        
        if (sucessor != null) {
            return sucessor.processarRequisição(requisicao);
        }
        
        return new Emprestimo(requisicao.getValor());
    }
}