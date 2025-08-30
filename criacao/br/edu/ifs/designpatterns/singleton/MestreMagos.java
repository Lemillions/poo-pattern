package br.edu.ifs.designpatterns.singleton;

public class MestreMagos {
    private static MestreMagos instancia;
    private int nivelMagia;
    
    private MestreMagos() {
        this.nivelMagia = 1;
    }
    
    public static MestreMagos obterInstancia() {
        if (instancia == null) {
            instancia = new MestreMagos();
        }
        return instancia;
    }
    
    public void elevarNivel() {
        this.nivelMagia++;
    }
    
    public int getNivelMagia() {
        return nivelMagia;
    }
}