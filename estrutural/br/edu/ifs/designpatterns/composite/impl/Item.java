package br.edu.ifs.designpatterns.composite.impl;

import br.edu.ifs.designpatterns.composite.Componente;

public class Item extends Componente {
    private String nome;
    private double preco;
    
    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    @Override
    public double calcularPreco() {
        return preco;
    }
}