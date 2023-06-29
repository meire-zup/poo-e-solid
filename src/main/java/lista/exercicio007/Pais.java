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

    public Pais(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getPopulacao() {
        return populacao;
    }

    public void setPopulacao(Long populacao) {
        this.populacao = populacao;
    }

    public Long getDimensao() {
        return dimensao;
    }

    public void setDimensao(Long dimensao) {
        this.dimensao = dimensao;
    }
}
