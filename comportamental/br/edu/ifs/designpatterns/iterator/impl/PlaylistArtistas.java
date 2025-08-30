package br.edu.ifs.designpatterns.iterator.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import br.edu.ifs.designpatterns.iterator.Agregador;
import br.edu.ifs.designpatterns.iterator.Iterador;

public class PlaylistArtistas implements Agregador<Musica> {
    private List<Musica> musicas = new ArrayList<>();
    
    public void adicionar(Musica musica) {
        musicas.add(musica);
    }
    
    @Override
    public Iterador<Musica> criarIterador() {
        List<Musica> musicasOrdenadas = new ArrayList<>(musicas);
        Collections.sort(musicasOrdenadas, Comparator.comparing(Musica::getArtista));
        return new IteradorArtistas(musicasOrdenadas);
    }
    
    private class IteradorArtistas implements Iterador<Musica> {
        private List<Musica> musicas;
        private int posicao = 0;
        
        public IteradorArtistas(List<Musica> musicas) {
            this.musicas = musicas;
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