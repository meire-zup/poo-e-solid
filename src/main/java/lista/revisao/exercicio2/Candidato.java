package lista.revisao.exercicio2;

public class Candidato {
    private Integer numeroDeMatricula;

    private Double nota;

    public Candidato(Integer numeroDeMatricula, Double nota) {
        this.numeroDeMatricula = numeroDeMatricula;
        this.nota = nota;
    }

    public Integer getNumeroDeMatricula() {
        return numeroDeMatricula;
    }

    public Double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "{" +
                "numeroDeMatricula=" + numeroDeMatricula +
                ", nota=" + nota +
                '}';
    }

}
