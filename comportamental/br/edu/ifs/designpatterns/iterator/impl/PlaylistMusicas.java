package br.edu.ifs.designpatterns.iterator.impl;

import java.util.ArrayList;
import java.util.List;
import br.edu.ifs.designpatterns.iterator.Agregador;
import br.edu.ifs.designpatterns.iterator.Iterador;

public class PlaylistMusicas implements Agregador<Musica> {
    private List<Musica> musicas = new ArrayList<>();
    
    public void adicionar(Musica musica) {
        musicas.add(musica);
    }
    
    @Override
    public Iterador<Musica> criarIterador() {
        return new IteradorMusicas(musicas);
    }
    
    private class IteradorMusicas implements Iterador<Musica> {
        private List<Musica> musicas;
        private int posicao = 0;
        
        public IteradorMusicas(List<Musica> musicas) {
            this.musicas = new ArrayList<>(musicas);
        }
        
        @Override
        public boolean temProximo() {
            return posicao < musicas.size();
        }
        
        @Override
        public Musica proximo() {
            return musicas.get(posicao++);
        }
    }
}