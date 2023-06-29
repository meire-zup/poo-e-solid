package lista.exercicio007;

import java.util.HashSet;
import java.util.Set;

public class Pais {

    private String codigo;

    private String nome;

    private Long populacao;

    private Long dimensao;

    Set<Pais> paisesFronteira = new HashSet<>();


    public Pais(String codigo, String nome, Long dimensao) {
        this.codigo = codigo;
        this.nome = nome;
        this.dimensao = dimensao;
    }


    public String getNome() {

        return nome;

    }

    public Long getPopulacao() {

        return populacao;

    }

    public void setPopulacao(Long populacao) {

        this.populacao = populacao;

    }


}
