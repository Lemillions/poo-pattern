package br.edu.ifs.designpatterns.command;

public class Luz {
    private String nome;
    private boolean ligada;
    
    public Luz(String nome) {
        this.nome = nome;
        this.ligada = false;
    }
    
    public void ligar() {
        this.ligada = true;
    }
    
    public void desligar() {
        this.ligada = false;
    }
    
    public boolean estaLigada() {
        return ligada;
    }
    
    public String getNome() {
        return nome;
    }
}