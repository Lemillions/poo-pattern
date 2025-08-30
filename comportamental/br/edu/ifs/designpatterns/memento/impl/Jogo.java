package br.edu.ifs.designpatterns.memento.impl;

import br.edu.ifs.designpatterns.memento.Armazenador;

public class Jogo {
    private int saude = 100;
    private int vidas = 3;
    
    public void causarDano(int dano) {
        saude -= dano;
        if (saude <= 0) {
            if (vidas > 1) {
                vidas--;
                saude = 100;
            } else {
                throw new IllegalStateException("Fim de Jogo");
            }
        }
    }
    
    public EstadoJogo salvar() {
        return new EstadoJogo(saude, vidas);
    }
    
    public void restaurar(Object estadoObj) {
        EstadoJogo estado = (EstadoJogo) estadoObj;
        this.saude = estado.getSaude();
        this.vidas = estado.getVidas();
    }
    
    @Override
    public String toString() {
        return "{saúde: " + saude + ", vidas: " + vidas + "}";
    }
    
    private static class EstadoJogo {
        private int saude;
        private int vidas;
        
        public EstadoJogo(int saude, int vidas) {
            this.saude = saude;
            this.vidas = vidas;
        }
        
        public int getSaude() { return saude; }
        public int getVidas() { return vidas; }
    }
}