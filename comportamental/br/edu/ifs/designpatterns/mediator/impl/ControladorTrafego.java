package br.edu.ifs.designpatterns.mediator.impl;

import java.util.ArrayList;
import java.util.List;
import br.edu.ifs.designpatterns.mediator.Colaborador;
import br.edu.ifs.designpatterns.mediator.Mediador;

public class ControladorTrafego implements Mediador {
    private List<String> filaPousos = new ArrayList<>();
    private List<String> filaDecolagens = new ArrayList<>();
    private List<String> aeronavesPendentesManutencao = new ArrayList<>();
    private boolean condicoesFavoraveis = false;
    
    public void adicionarAeronaveManutencao(String aeronave) {
        aeronavesPendentesManutencao.add(aeronave);
    }
    
    public void setCondicoesFavoraveis(boolean favoraveis) {
        this.condicoesFavoraveis = favoraveis;
    }
    
    @Override
    public String solicitarPouso(String aeronave) {
        if (!condicoesFavoraveis) {
            filaPousos.add(aeronave);
            return aeronave + ": Pouso negado - condições metereológicas.";
        }
        return aeronave + ": Pouso autorizado.";
    }
    
    @Override
    public String solicitarDecolagem(String aeronave) {
        if (!condicoesFavoraveis) {
            filaDecolagens.add(aeronave);
            return aeronave + ": Decolagem negada - condições metereológicas.";
        }
        
        if (aeronavesPendentesManutencao.contains(aeronave)) {
            return aeronave + ": Decolagem negada - manutenção.";
        }
        
        return aeronave + ": Decolagem autorizada.";
    }
    
    @Override
    public void informarCondicoes() {
        
    }
    
    public String processarFilas() {
        StringBuilder resultado = new StringBuilder();
        
        List<String> pousosAutorizados = new ArrayList<>();
        for (String aeronave : filaPousos) {
            pousosAutorizados.add(aeronave + ": Pouso autorizado.");
        }
        
        List<String> decolagensAutorizadas = new ArrayList<>();
        for (String aeronave : filaDecolagens) {
            if (aeronavesPendentesManutencao.contains(aeronave)) {
                decolagensAutorizadas.add(aeronave + ": Decolagem negada - manutenção.");
            } else {
                decolagensAutorizadas.add(aeronave + ": Decolagem autorizada.");
            }
        }
        
        filaPousos.clear();
        filaDecolagens.clear();
        
        resultado.append(pousosAutorizados.toString()).append("\n");
        resultado.append(decolagensAutorizadas.toString());
        
        return resultado.toString();
    }
}