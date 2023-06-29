package lista.revisao.exercicio1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ServiceProduto {

    List<Produto> produtos = new ArrayList<>();

    public void adicionar(String nome, Double preco, int quantidade) {

        Produto produto = new Produto(nome, preco);

        for (int i = 0; i < quantidade; i++) {

            produtos.add(produto);

        }

        System.out.println("Produto adicinonado com sucesso!");
        System.out.println("Produto: " + produto.getNome() + " \nPreço: " + produto.getPreco() + " \nQuantidade: " + quantidade);

    }

    public void listarProduto() {

        for (Produto produto : produtos) {

            System.out.println(produto);

        }
    }

    public void excluirProduto(String nome) {
        if (produtoExiste(nome)) {
            Iterator<Produto> iterator = produtos.iterator();
            while (iterator.hasNext()) {
                Produto produto = iterator.next();
                if (produto.getNome().equalsIgnoreCase(nome)) {
                    iterator.remove();
                }
            }
            System.out.println("Produtos com nome " + nome + " excluídos com sucesso!");
        } else {
            System.out.println("Produto não encontrado!");
        }
    }


    private boolean produtoExiste(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }
}
