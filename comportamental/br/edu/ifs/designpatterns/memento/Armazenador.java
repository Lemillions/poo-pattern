package br.edu.ifs.designpatterns.memento;

import java.util.Stack;

public class Armazenador {
    private Stack<Object> estados = new Stack<>();
    
    public void armazenar(Object estado) {
        estados.push(estado);
    }
    
    public Object recuperar() {
        if (estados.isEmpty()) {
            throw new IllegalStateException("Histórico vazio");
        }
        return estados.pop();
    }
}