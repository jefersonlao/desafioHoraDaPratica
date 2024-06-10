package br.com.desafioHoraDaPratica.exercicio4;

public class VerificadorPrimo extends NumerosPrimos{
    public void verificarSePrimo(int numero) {
        if (verificarPrimalidade(numero)) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }
    }
}
