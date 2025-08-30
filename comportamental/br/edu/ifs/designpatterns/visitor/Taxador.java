package br.edu.ifs.designpatterns.visitor;

import br.edu.ifs.designpatterns.visitor.impl.Alimento;
import br.edu.ifs.designpatterns.visitor.impl.Cerveja;
import br.edu.ifs.designpatterns.visitor.impl.Cigarro;
import br.edu.ifs.designpatterns.visitor.impl.Vinho;

public interface Taxador {
    double taxar(Alimento alimento);
    double taxar(Cerveja cerveja);
    double taxar(Cigarro cigarro);
    double taxar(Vinho vinho);
}