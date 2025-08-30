package br.edu.ifs.designpatterns.iterator;

public interface Iterador<T> {
    boolean temProximo();
    T proximo();
}