package lista.revisao.exercicio3;

import java.util.ArrayList;

/*
 Crie um programa para gerenciar o cardápio de um restaurante. Cada prato tem um nome
 e pode conter diversos ingredientes. No final do programa, o usuário deve decidir se
 irá adicionar mais de um prato, exibir todos os pratos cadastrados ou excluir um prato pelo nome.
 */
public class Main {

    public static void main(String[] args) {

        GerenciamentoCardapio gerenciamentoCardapio = new GerenciamentoCardapio();

        Ingrediente ingrediente1 = new Ingrediente("carne de frango");
        Ingrediente ingrediente2 = new Ingrediente("molho");
        Ingrediente ingrediente3 = new Ingrediente("salada");
        Ingrediente ingrediente4 = new Ingrediente("feijão");
        Ingrediente ingrediente5 = new Ingrediente("batata recheada");
        Ingrediente ingrediente6 = new Ingrediente("calda de chocolate");
        Ingrediente ingrediente7 = new Ingrediente("pudim");


        Prato prato1 = new Prato("entrada");
        prato1.getIngredientes().add(ingrediente2);
        prato1.getIngredientes().add(ingrediente3);

        Prato prato2 = new Prato("principal");
        prato2.getIngredientes().add(ingrediente1);
        prato2.getIngredientes().add(ingrediente2);


        Prato prato3 = new Prato("sobremesa");
        prato3.getIngredientes().add(ingrediente6);
        prato3.getIngredientes().add(ingrediente7);


        gerenciamentoCardapio.montarCardapio(prato1, prato2, prato3);






    }
}
