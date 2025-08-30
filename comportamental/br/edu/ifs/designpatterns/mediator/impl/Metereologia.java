package br.edu.ifs.designpatterns.mediator.impl;

import br.edu.ifs.designpatterns.mediator.Colaborador;
import br.edu.ifs.designpatterns.mediator.Mediador;

public class Metereologia extends Colaborador {
    private boolean condicoesFavoraveis = false;
    
    public Metereologia(String id, Mediador mediador) {
        super(id, mediador);
    }
    
    public void setCondicoesFavoraveis(boolean favoraveis) {
        this.condicoesFavoraveis = favoraveis;
        if (mediador instanceof ControladorTrafego) {
            ((ControladorTrafego) mediador).setCondicoesFavoraveis(favoraveis);
        }
    }
    
    public String informarCondicoes() {
        if (condicoesFavoraveis && mediador instanceof ControladorTrafego) {
            return ((ControladorTrafego) mediador).processarFilas();
        }
        return "";
    }
}