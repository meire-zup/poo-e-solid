package lista.exercicio007;

public class ServicePais {
    public boolean eVizinho(Pais pais1, Pais pais2) {

        if (pais1.paisesFronteira.contains(pais2)) {
            return true;
        }
        return false;
    }


    public Long getDensidade(Pais pais) {

        return pais.getPopulacao();

    }

    public void listarVizinhos(Pais pais) {
        System.out.println("Países que fazem fronteira com " + pais.getNome());
        for (Pais pais1 : pais.paisesFronteira) {
            System.out.println(pais1.getNome());
        }
    }
}
