package com.lcdrefactor.numero;

import com.lcdrefactor.controlador.Controller;
import com.lcdrefactor.main.ImpresorLCD;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Digito extends ImpresorLCD {

    private Map<Integer, Numero> map = new HashMap<>();

    public Digito() {
        map.put(1, Numero.Uno);
        map.put(2, Numero.Dos);
        map.put(3, Numero.Tres);
        map.put(4, Numero.Cuatro);
        map.put(5, Numero.Cinco);
        map.put(6, Numero.Seis);
        map.put(7, Numero.Siete);
        map.put(8, Numero.Ocho);
        map.put(9, Numero.Nueve);
        map.put(0, Numero.Cero);
    }

    /**
     * Metodo encargado de definir los segmentos que componen un digito y
     * a partir de los segmentos adicionar la representacion del digito a la matriz
     *
     * @param numero Digito
     */
    public void adicionarDigito(int numero) {
        List<Integer> segmentosList = new ArrayList<>();
        Controller.impresor.setSegList( map.get(numero).getList(numero));
    }

}

