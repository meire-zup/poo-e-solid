package lista.revisao.exercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ServiceCandidato {

    List<Candidato> candidatos = new ArrayList<>();

    public void adicionar(Long nomeDeMatricula, Double nota) {

        Candidato candidato = new Candidato(nomeDeMatricula, nota);

        candidatos.add(candidato);

        System.out.println("Candidato adicinonado com sucesso!");
        System.out.println("Candidato: " + candidato.getNumeroDeMatricula() + " \nNota: " + candidato.getNota());

    }

    public void listarCandidatos() {

        for (Candidato candidato : candidatos) {

            System.out.println(candidato);

        }
    }

    public void excluirCandidato(Long numeroDeMatricula) {
        if (candidatoExiste(numeroDeMatricula)) {
            Iterator<Candidato> iterator = candidatos.iterator();
            while (iterator.hasNext()) {
                Candidato candidato = iterator.next();
                if (candidato.getNumeroDeMatricula().compareTo(numeroDeMatricula) == 0) {
                    iterator.remove();
                }
            }
            System.out.println("Candidato com número de matrícula " + numeroDeMatricula + " excluídos com sucesso!");
        } else {
            System.out.println("Candidato não encontrado!");
        }
    }


    private boolean candidatoExiste(Long numeroDeMatricula) {
        for (Candidato candidato : candidatos) {
            if (candidato.getNumeroDeMatricula().compareTo(numeroDeMatricula) == 0) {
                return true;
            }
        }
        return false;
    }

}
