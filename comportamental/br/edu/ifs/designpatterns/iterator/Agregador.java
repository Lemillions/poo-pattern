package br.edu.ifs.designpatterns.iterator;

public interface Agregador<T> {
    Iterador<T> criarIterador();
}