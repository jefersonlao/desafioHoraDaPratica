package br.com.desafioHoraDaPraticaArrayList.artigoEstruturaDeDados.listas;

public class VetorTeste {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Joao");
        Aluno a2 = new Aluno("Jose");
        Aluno a3 = new Aluno("Danilo");

        Vetor lista = new Vetor();
        lista.adiciona(0, a1);
        lista.adiciona(1, a2);
        lista.adiciona(2, a3);
        System.out.println(lista.tamanho());
//
//        Aluno x = lista.pega(2);
//        System.out.println(x);
//
//        lista.remove(1);
//        System.out.println(lista);

        for(int i = 0; i < 300; i++){
            Aluno a4 = new Aluno("Joao" + i);
            lista.adiciona(i+3, a4);

        }
        System.out.println(lista);
        lista.remove(4);
        System.out.println(lista);
    }
}
