package br.edu.ifs.designpatterns.prototype;

public abstract class Robo {
    protected int energia;
    protected int ataque;
    protected String arma;
    
    public Robo(int energia, int ataque, String arma) {
        this.energia = energia;
        this.ataque = ataque;
        this.arma = arma;
    }
    
    public abstract Robo clonar();
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Robo robo = (Robo) obj;
        return energia == robo.energia && 
               ataque == robo.ataque && 
               arma.equals(robo.arma);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(energia, ataque, arma);
    }
}