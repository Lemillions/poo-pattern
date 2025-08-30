package br.edu.ifs.designpatterns.composite.impl;

import java.util.ArrayList;
import java.util.List;
import br.edu.ifs.designpatterns.composite.Componente;

public class Combo extends Componente {
    private String nome;
    private List<Componente> componentes;
    
    public Combo(String nome) {
        this.nome = nome;
        this.componentes = new ArrayList<>();
    }
    
    public void adicionar(Componente componente) {
        componentes.add(componente);
    }
    
    @Override
    public double calcularPreco() {
        return componentes.stream().mapToDouble(Componente::calcularPreco).sum();
    }
}