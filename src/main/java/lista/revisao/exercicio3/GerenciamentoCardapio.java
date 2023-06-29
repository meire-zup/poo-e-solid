package lista.revisao.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class GerenciamentoCardapio {
     private List<Prato> pratos = new ArrayList<>();

    public List<Prato> getPratos() {
        return pratos;
    }

    public  void listarPratos() {

        for (Prato prato : pratos) {

            System.out.println("Prato: " + prato.getNome());
        }
    }

    public  void montarCardapio(Prato prato1,Prato prato2, Prato prato3) {

        List<Prato> cardapio = new ArrayList<>();

            cardapio.add(prato1);
            cardapio.add(prato2);
            cardapio.add(prato3);

        System.out.println(cardapio.toString());

    }

    public void excluirPrato(Prato prato) {

        pratos.remove(prato);
        System.out.println(prato.getNome() + " excluído com sucesso!");
    }

}
