package lista.revisao.exercicio3;

public class Ingrediente {

    private String nome;

    public Ingrediente(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Ingrediente{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
