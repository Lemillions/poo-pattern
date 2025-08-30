package br.edu.ifs.designpatterns.abstractfactory.implB;

import br.edu.ifs.designpatterns.abstractfactory.Botao;
import br.edu.ifs.designpatterns.abstractfactory.FabricaInterfaceGrafica;
import br.edu.ifs.designpatterns.abstractfactory.Janela;
import br.edu.ifs.designpatterns.abstractfactory.Menu;

public class TemaEscuro implements FabricaInterfaceGrafica {
    
    @Override
    public Janela criarJanela() {
        return new JanelaEscura();
    }
    
    @Override
    public Botao criarBotao() {
        return new BotaoEscuro();
    }
    
    @Override
    public Menu criarMenu() {
        return new MenuEscuro();
    }
}