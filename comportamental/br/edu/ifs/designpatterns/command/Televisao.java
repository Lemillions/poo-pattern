package br.edu.ifs.designpatterns.command;

public class Televisao {
    private String nome;
    private boolean ligada;
    private int canal;
    
    public Televisao(String nome) {
        this.nome = nome;
        this.ligada = false;
        this.canal = 1;
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
    
    public void avancarCanal() {
        if (!ligada) {
            throw new IllegalStateException("Televisão desligada");
        }
        this.canal++;
    }
    
    public void retrocederCanal() {
        if (!ligada) {
            throw new IllegalStateException("Televisão desligada");
        }
        this.canal--;
    }
    
    public int getCanal() {
        return canal;
    }
    
    public String getNome() {
        return nome;
    }
}