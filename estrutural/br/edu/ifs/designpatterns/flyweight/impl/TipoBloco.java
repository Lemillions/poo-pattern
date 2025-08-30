package br.edu.ifs.designpatterns.flyweight.impl;

import br.edu.ifs.designpatterns.flyweight.Flyweight;

public class TipoBloco implements Flyweight {
    private String tipo;
    private boolean quebravel;
    private boolean inflamavel;
    private boolean empilhavel;
    
    public TipoBloco(String tipo, boolean quebravel, boolean inflamavel, boolean empilhavel) {
        this.tipo = tipo;
        this.quebravel = quebravel;
        this.inflamavel = inflamavel;
        this.empilhavel = empilhavel;
    }
    
    @Override
    public String mostrar(int x, int y, int z) {
        StringBuilder sb = new StringBuilder();
        sb.append(tipo).append(", ");
        sb.append(quebravel ? "quebrável" : "inquebrável").append(", ");
        sb.append("inflamável").append(", ");
        sb.append(empilhavel ? "empilhável" : "não empilhável").append(", ");
        sb.append("x: ").append(x).append(", ");
        sb.append("y: ").append(y).append(", ");
        sb.append("z: ").append(z);
        return sb.toString();
    }
}