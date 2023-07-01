package lista.revisao.exercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ServiceCandidato {

    List<Candidato> candidatos = new ArrayList<>();

    public void adicionar(Integer numeroDeMatricula, Double nota) {

        Candidato candidato = new Candidato(numeroDeMatricula, nota);

        candidatos.add(candidato);

        System.out.println("Candidato adicinonado com sucesso!");
        System.out.println("Candidato: " + candidato.getNumeroDeMatricula() + " \nNota: " + candidato.getNota());
        System.out.println("------------------------------------------");


    }

    public void listarCandidatos() {

        for (Candidato candidato : candidatos) {

            System.out.println(candidato.toString());

        }
    }

    public void excluirCandidato(Integer numeroDeMatricula) {
        if (candidatoExiste(numeroDeMatricula)) {
            Iterator<Candidato> iterator = candidatos.iterator();
            while (iterator.hasNext()) {
                Candidato candidato = iterator.next();
                if (candidato.getNumeroDeMatricula().compareTo(numeroDeMatricula) == 0) {
                    iterator.remove();
                }
            }
            System.out.println("Candidato com número de matrícula " + numeroDeMatricula + " excluído com sucesso!");
        } else {
            System.out.println("Candidato não encontrado!");
        }
    }


    private boolean candidatoExiste(Integer numeroDeMatricula) {
        for (Candidato candidato : candidatos) {
            if (candidato.getNumeroDeMatricula().compareTo(numeroDeMatricula) == 0) {
                return true;
            }
        }
        return false;
    }

}
