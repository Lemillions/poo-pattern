package br.edu.ifs.designpatterns.bridge.obj;

import java.util.ArrayList;
import java.util.List;
import br.edu.ifs.designpatterns.bridge.ObjetoGrafico;
import br.edu.ifs.designpatterns.bridge.Plataforma;

public class HollowKnight extends ObjetoGrafico {
    
    public HollowKnight(Plataforma plataforma) {
        super(plataforma);
        this.velocidade = 15;
    }
    
    @Override
    public List<Ponto> andar(boolean frente) {
        List<Ponto> trajetoria = new ArrayList<>();
        int fps = plataforma.getFPS();
        double increment = (double) velocidade / fps;
        
        trajetoria.add(new Ponto(posicao.getX(), posicao.getY()));
        
        for (int i = 1; i <= fps; i++) {
            double novoX = frente ? i * increment : posicao.getX() - i * increment;
            trajetoria.add(new Ponto(novoX, posicao.getY()));
        }
        
        posicao = trajetoria.get(trajetoria.size() - 1);
        return trajetoria;
    }
    
    @Override
    public List<Ponto> correr(boolean frente) {
        List<Ponto> trajetoria = new ArrayList<>();
        int fps = plataforma.getFPS();
        double increment = (double) (velocidade * 2) / fps;
        
        trajetoria.add(new Ponto(posicao.getX(), posicao.getY()));
        
        for (int i = 1; i <= fps; i++) {
            double novoX = frente ? posicao.getX() + i * increment : posicao.getX() - i * increment;
            trajetoria.add(new Ponto(novoX, posicao.getY()));
        }
        
        posicao = trajetoria.get(trajetoria.size() - 1);
        return trajetoria;
    }
    
    @Override
    public List<Ponto> pular() {
        List<Ponto> trajetoria = new ArrayList<>();
        int fps = plataforma.getFPS();
        double increment = (double) velocidade / fps;
        
        trajetoria.add(new Ponto(posicao.getX(), posicao.getY()));
        
        for (int i = 1; i <= fps; i++) {
            trajetoria.add(new Ponto(posicao.getX(), i * increment));
        }
        
        trajetoria.add(new Ponto(posicao.getX(), velocidade));
        
        for (int i = fps - 1; i >= 1; i--) {
            trajetoria.add(new Ponto(posicao.getX(), i * increment));
        }
        
        trajetoria.add(new Ponto(posicao.getX(), posicao.getY()));
        
        return trajetoria;
    }
}