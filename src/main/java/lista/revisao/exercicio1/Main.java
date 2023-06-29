package lista.revisao.exercicio1;

public class Main {

    public static void main(String[] args) {

        // Instanciando objetos:
        ServiceProduto serviceProduto = new ServiceProduto();

        // Testando método adicionar produto:
        serviceProduto.adicionarProduto("caneta", 5.0, 3);
        serviceProduto.adicionarProduto("lápis", 3.0, 2);

        // Testando método listar produto:
        System.out.println("-------- PRODUTOS --------");
        serviceProduto.listarProduto();

        // Testando método excluir produto:
        serviceProduto.excluirProduto("caneta");

        // Testando método listar produto após exclusão:
        System.out.println("-------- PRODUTOS --------");
        serviceProduto.listarProduto();

    }
}
