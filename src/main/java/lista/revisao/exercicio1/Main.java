package lista.revisao.exercicio1;

public class Main {

    public static void main(String[] args) {

        ServiceProduto serviceProduto = new ServiceProduto();

        serviceProduto.adicionar("caneta", 5.0, 3);
        serviceProduto.adicionar("lápis", 3.0, 2);


        serviceProduto.listarProduto();

        serviceProduto.excluirProduto("caneta");

        serviceProduto.listarProduto();



    }
}
