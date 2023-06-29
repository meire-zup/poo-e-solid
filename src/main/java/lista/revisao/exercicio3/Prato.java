package lista.revisao.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Prato {

    private String nome;

    private List<Ingrediente> ingredientes = new ArrayList<>();

    public Prato(String nome) {
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "Prato{" +
                "nome='" + nome + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
