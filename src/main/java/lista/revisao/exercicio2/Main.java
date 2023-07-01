package lista.revisao.exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // Instanciando objetos:
        ServiceCandidato serviceCandidato = new ServiceCandidato();

        InteracaoUsuario interacaoUsuario = new InteracaoUsuario(serviceCandidato);


        // Testando método adicionar candidato:
        interacaoUsuario.adicionarCandidatos();

        // Testando método listar candidatos:
        serviceCandidato.listarCandidatos();


        // Testando método excluir funcionário
        serviceCandidato.excluirCandidato(45);
        serviceCandidato.listarCandidatos();

    }

}
