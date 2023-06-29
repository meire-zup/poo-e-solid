package lista.revisao.exercicio2;

import java.util.Scanner;

public class InteracaoUsuario {


    Scanner scanner = new Scanner(System.in);

    ServiceCandidato serviceCandidato = new ServiceCandidato();

    public void adicionarCandidatos() {

        System.out.println("Quantos candidatos deseja adicionar:");
        int quantidade = scanner.nextInt();

        for (int i = 0; i <quantidade ; i++) {
            System.out.println("Informe o numero da matricula:");
            int numeroMatricula = scanner.nextInt();
            System.out.println("Informe a nota do candidato:");
            double nota = scanner.nextDouble();
            serviceCandidato.adicionar(numeroMatricula,nota);
        }
    }
}
