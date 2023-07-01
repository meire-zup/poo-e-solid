package lista.revisao.exercicio2;

import java.util.Scanner;

public class InteracaoUsuario {


    Scanner scanner = new Scanner(System.in);

    ServiceCandidato serviceCandidato;

    public InteracaoUsuario(ServiceCandidato serviceCandidato) {
        this.serviceCandidato = serviceCandidato;
    }

    public void adicionarCandidatos() {

        System.out.println("Quantos candidatos deseja adicionar:");
        int quantidade = scanner.nextInt();

        for (int i = 0; i <quantidade ; i++) {
            System.out.println("Informe o numero da matricula:");
            Integer numeroMatricula = scanner.nextInt();
            System.out.println("Informe a nota do candidato:");
            Double nota = scanner.nextDouble();
            serviceCandidato.adicionar(numeroMatricula,nota);
        }
    }
}
