package br.edu.ifs.designpatterns.flyweight.impl;

import br.edu.ifs.designpatterns.flyweight.Flyweight;

public class Bloco {
    private int x, y, z;
    private Flyweight tipo;
    
    public Bloco(int x, int y, int z, Flyweight tipo) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.tipo = tipo;
    }
    
    public Flyweight getTipo() {
        return tipo;
    }
    
    public String mostrar() {
        return tipo.mostrar(x, y, z);
    }
}