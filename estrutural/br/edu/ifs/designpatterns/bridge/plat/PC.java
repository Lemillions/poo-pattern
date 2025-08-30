package br.edu.ifs.designpatterns.bridge.plat;

import br.edu.ifs.designpatterns.bridge.Plataforma;

public class PC implements Plataforma {
    
    @Override
    public int getFPS() {
        return 5;
    }
}