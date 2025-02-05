package br.com.desafioHoraDaPraticaArrayList.artigoEstruturaDeDados.listas;

public class ListaLigadaTeste {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        System.out.println(lista);
        lista.adicionaNoComeco("mauricio");
        System.out.println(lista);
        lista.adicionaNoComeco("paulo");
        System.out.println(lista);
        lista.adicionaNoComeco("guilherme");
        System.out.println(lista);

        lista.adiciona("marcelo");
        System.out.println(lista);

        lista.adiciona(2, "Gabriel");
        System.out.println(lista);
        lista.adiciona(1, "Cecilia");

        Object x = lista.pega(2);
        System.out.println(x);

        System.out.println(lista.tamanho());

        lista.removeDoComeco();
        System.out.println(lista);

        lista.removeDoFim();
        System.out.println(lista);
        lista.remove(2);
        System.out.println(lista);

        System.out.println(lista.contem("mauricio"));
        System.out.println(lista.contem("Gabriel"));
        System.out.println(lista.contem("mauricio"));
    }
}
