package br.edu.ifs.designpatterns.abstractfactory;

public interface FabricaInterfaceGrafica {
    Janela criarJanela();
    Botao criarBotao();
    Menu criarMenu();
}