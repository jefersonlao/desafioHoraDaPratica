package br.com.desafioHoraDaPraticaArrayList.artigoEstruturaDeDados.fila;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;

public class TesteDaFila {
    public static void main(String[] args) {
        Fila fila = new Fila();
        fila.adiciona("Jeferson");
        fila.adiciona("Lucas");
        System.out.println(fila);

        String x1 = fila.remove();
        System.out.println(x1);
        System.out.println(fila);

        Queue<String> filaDoJava = new LinkedList<String>();
        filaDoJava.add("Jeferson");
        String x2 = filaDoJava.poll();
        System.out.println(x2);
    }
}
