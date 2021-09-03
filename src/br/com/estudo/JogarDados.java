package br.com.estudo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class JogarDados {
    public static void main(String[] args) {
        Map<Integer,Integer> lancamentoDado = new HashMap<>();
        Random random= new Random();
        for (var i = 0; i < 100; i++){
            var valor = random.ints(1,6).findFirst().getAsInt();
            if(lancamentoDado.get(valor) != null) {
                for (Map.Entry<Integer, Integer> dado : lancamentoDado.entrySet()) {
                    if (dado.getKey() == valor)
                        lancamentoDado.put(valor, dado.getValue() + 1);
                }
            }else{
                lancamentoDado.put(valor,1);
            }

        }
        System.out.println(lancamentoDado);
    }

}
