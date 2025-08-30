package br.edu.ifs.designpatterns.interpreter.terminal;

public class Variavel<T> {
    private String nome;
    private T valor;
    
    public Variavel(String nome, T valor) {
        this.nome = nome;
        this.valor = valor;
    }
    
    public Variavel(T valor) {
        this.valor = valor;
    }
    
    public T getValor() { return valor; }
    public String getNome() { return nome; }
    
    @Override
    public String toString() {
        return nome != null ? nome : valor.toString();
    }
}