package br.edu.ifs.designpatterns.mediator.impl;

import br.edu.ifs.designpatterns.mediator.Colaborador;
import br.edu.ifs.designpatterns.mediator.Mediador;

public class Aeronave extends Colaborador {
    
    public Aeronave(String id, Mediador mediador) {
        super(id, mediador);
    }
    
    public String solicitarPouso() {
        return mediador.solicitarPouso(id);
    }
    
    public String solicitarDecolagem() {
        return mediador.solicitarDecolagem(id);
    }
}