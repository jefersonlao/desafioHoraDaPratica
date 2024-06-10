package br.com.desafioHoraDaPraticaArrayList.artigoEstruturaDeDados;

import java.util.HashMap;
import java.util.Map;

public class TesteHashMap {
    public static void main(String[] args) {
        Map<String, Integer> usandoHashMap = new HashMap<>();

        usandoHashMap.put("Gatos", 1);
        usandoHashMap.put("Cachorros", 2);
        usandoHashMap.put("Roedores", 3);

        int valo = usandoHashMap.get("Cachorros");
        System.out.println("valor da chave = " + valo);

        usandoHashMap.remove("Gatos");

        for (String chave : usandoHashMap.keySet()) {
            System.out.println("Chave: " + chave);
            System.out.println("Valor: " + usandoHashMap.get(chave));
        }
    }
}
