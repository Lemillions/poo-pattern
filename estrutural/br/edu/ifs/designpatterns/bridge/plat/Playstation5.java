package br.edu.ifs.designpatterns.bridge.plat;

import br.edu.ifs.designpatterns.bridge.Plataforma;

public class Playstation5 implements Plataforma {
    
    @Override
    public int getFPS() {
        return 3;
    }
}