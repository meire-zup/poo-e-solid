package lista.revisao.exercicio2;

public class Candidato {
    private Long numeroDeMatricula;

    private Double nota;

    public Candidato(Long numeroDeMatricula, Double nota) {
        this.numeroDeMatricula = numeroDeMatricula;
        this.nota = nota;
    }


    public Long getNumeroDeMatricula() {
        return numeroDeMatricula;
    }

    public void setNumeroDeMatricula(Long numeroDeMatricula) {
        this.numeroDeMatricula = numeroDeMatricula;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }


    @Override
    public String toString() {
        return "{" +
                "numeroDeMatricula=" + numeroDeMatricula +
                ", nota=" + nota +
                '}';
    }

}
