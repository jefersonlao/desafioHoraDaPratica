import br.com.desafioHoraDaPraticaArrayList.exercicio1.Pessoa;
import br.com.desafioHoraDaPraticaArrayList.exercicio1.ProdutoProduto;
import br.com.desafioHoraDaPraticaArrayList.exercicio1.ProdutoProdutoPerecivel;
import br.com.desafioHoraDaPraticaInterfaces.exercicio1.ConversorMoeda;
import br.com.desafioHoraDaPraticaInterfaces.exercicio2.CalculadoraSalaRetangular;
import br.com.desafioHoraDaPraticaInterfaces.exercicio3.TabuadaMultiplicacao;
import br.com.desafioHoraDaPraticaInterfaces.exercicio4.ConversorTemperaturaPadrao;
import br.com.desafioHoraDaPraticaInterfaces.exercicio5.Livro;
import br.com.desafioHoraDaPraticaInterfaces.exercicio6.Produto;
import br.com.desafioHoraDaPraticaInterfaces.exercicio6.Servico;
import br.com.desafioHoraDaPraticaInterfaces.exercicio6.ServicoPreferido;

import java.sql.Array;
import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        ProdutoProduto cama = new ProdutoProduto("CamaBOX", 2587.99, 02);
        ProdutoProduto sofa = new ProdutoProduto("SofaCama", 2999.99, 03);

        ArrayList<ProdutoProduto> listaDeProduto = new ArrayList<>();
        listaDeProduto.add(cama);
        listaDeProduto.add(sofa);

        System.out.println("Quantidade de itens na lista: " + listaDeProduto.size());
        System.out.println("Item 2 da lista: " + listaDeProduto.get(1).getNome());
        System.out.println(listaDeProduto);

        ProdutoProdutoPerecivel maionese = new ProdutoProdutoPerecivel("HELMANS", 9.99, 01, "09/2024");
        System.out.println(maionese);





    }
}