package br.com.estudo;

import java.util.*;

public class EstudoEstados {
    public static void main(String[] args) {
        Map<String, Integer> estadosNordeste = new HashMap<>() {{
           put("PE",9616621);
           put("AL",3351543);
           put("CE",9187103);
           put("RN",3534265);
        }};
        System.out.println(estadosNordeste);
        estadosNordeste.put("RN",3534165);
        System.out.println(estadosNordeste.get("RN"));
        if(!estadosNordeste.containsKey ("PB")) estadosNordeste.put("PB",4039277);
        System.out.println(estadosNordeste);
        System.out.println(estadosNordeste.get("PB"));
        Map<String, Integer> estadosNordesteOrdemEntrada = new LinkedHashMap<>() {{
            put("PE",9616621);
            put("AL",3351543);
            put("CE",9187103);
            put("RN",3534265);
            put("PB",4039277);
        }};
        System.out.println(estadosNordesteOrdemEntrada);
        Map<String,Integer> estadosNordesteOrdemAlfabetica = new TreeMap<>(estadosNordesteOrdemEntrada);
        System.out.println(estadosNordesteOrdemAlfabetica);

        int menorPopulacao = Collections.min(estadosNordeste.values());
        for (Map.Entry<String,Integer> estado: estadosNordeste.entrySet()) {
            if(estado.getValue()==menorPopulacao) System.out.println("Estado com menor população: " + estado.getKey() + " - " + estado.getValue());
        }

        int maiorPopulacao = Collections.max(estadosNordeste.values());
        for (Map.Entry<String,Integer> estado: estadosNordeste.entrySet()) {
            if(estado.getValue()==maiorPopulacao) System.out.println("Estado com maior população: " + estado.getKey() + " - " + estado.getValue());
        }
        Integer soma = 0;
        Iterator<Integer> itEstados = estadosNordeste.values().iterator();
        while(itEstados.hasNext()){
            soma+=itEstados.next();
        }
        System.out.println("Soma dos estados: " + soma);
        System.out.println("Média dos estados: " + soma / estadosNordeste.size());
        for (Map.Entry<String,Integer> estado: estadosNordeste.entrySet()) {
            if(estado.getValue()<4000000) estadosNordeste.remove(estado);
        }
        System.out.println(estadosNordeste);
        estadosNordeste.clear();
        if(estadosNordeste.isEmpty())
            System.out.println("Não existem mais estados !");









    }

}

/*class EstadoNordeste {
    private String nome;
    private int populacao;

    public EstadoNordeste() {
    }

    public EstadoNordeste(String nome, int populacao) {
        this.nome = nome;
        this.populacao = populacao;
    }

    public String getNome() {
        return nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }


}*/

