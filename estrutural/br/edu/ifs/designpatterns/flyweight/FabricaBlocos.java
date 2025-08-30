package br.edu.ifs.designpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;
import br.edu.ifs.designpatterns.flyweight.impl.TipoBloco;

public class FabricaBlocos {
    private static Map<String, Flyweight> tipos = new HashMap<>();
    
    public static Flyweight obterTipo(String tipo, boolean quebravel, boolean inflamavel, boolean empilhavel) {
        String chave = tipo + quebravel + inflamavel + empilhavel;
        
        if (!tipos.containsKey(chave)) {
            tipos.put(chave, new TipoBloco(tipo, quebravel, inflamavel, empilhavel));
        }
        
        return tipos.get(chave);
    }
}