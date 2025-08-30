package br.edu.ifs.designpatterns.mediator;

public interface Mediador {
    String solicitarPouso(String aeronave);
    String solicitarDecolagem(String aeronave);
    void informarCondicoes();
}