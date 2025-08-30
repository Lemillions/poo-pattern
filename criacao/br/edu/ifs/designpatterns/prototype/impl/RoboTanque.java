package br.edu.ifs.designpatterns.prototype.impl;

import br.edu.ifs.designpatterns.prototype.Robo;

public class RoboTanque extends Robo {
    
    public RoboTanque(int energia, int ataque, String arma) {
        super(energia, ataque, arma);
    }
    
    @Override
    public Robo clonar() {
        return new RoboTanque(this.energia, this.ataque, this.arma);
    }
}