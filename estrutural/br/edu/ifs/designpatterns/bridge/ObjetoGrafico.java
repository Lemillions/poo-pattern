package br.edu.ifs.designpatterns.bridge;

import java.util.List;
import br.edu.ifs.designpatterns.bridge.obj.Ponto;

public abstract class ObjetoGrafico {
    protected Plataforma plataforma;
    protected int velocidade;
    protected Ponto posicao;
    
    public ObjetoGrafico(Plataforma plataforma) {
        this.plataforma = plataforma;
        this.posicao = new Ponto(0, 0);
    }
    
    public int getVelocidade() { return velocidade; }
    public Ponto getPosicao() { return posicao; }
    
    public abstract List<Ponto> andar(boolean frente);
    public abstract List<Ponto> correr(boolean frente);
    public abstract List<Ponto> pular();
}