package lista.revisao.exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        InteracaoUsuario interacaoUsuario = new InteracaoUsuario();

        // Instanciando objetos:
        ServiceCandidato serviceCandidato = new ServiceCandidato();

        // Testando método adicionar candidato:
        interacaoUsuario.adicionarCandidatos();

        // Testando método listar candidatos:
        serviceCandidato.listarCandidatos();
        serviceCandidato.adicionar(22, 5.0);
        serviceCandidato.adicionar(55, 8.0);

        serviceCandidato.listarCandidatos();

        // Testando método excluir funcionário
        serviceCandidato.excluirCandidato(22);
        serviceCandidato.listarCandidatos();


    }


}
