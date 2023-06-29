package lista.exercicio007;

import lista.revisao.exercicio2.ServiceCandidato;

public class Main {

    public static void main(String[] args) {

        ServicePais servicoPais = new ServicePais();

        Pais suica = new Pais("CHE", "Suíça", 41290L);
        Pais alemanha = new Pais("DEU", "Alemanha", 41290L);
        Pais austria = new Pais("AUT", "Áustria", 41290L);
        Pais franca = new Pais("FRA", "França", 41290L);
        Pais principadoDeLiechtenstein = new Pais("LIE", "Proncipado de Liechtenstein", 41290L);

        suica.paisesFronteira.add(alemanha);
        suica.paisesFronteira.add(austria);
        suica.paisesFronteira.add(franca);
        suica.paisesFronteira.add(principadoDeLiechtenstein);

        suica.setPopulacao(8700000L);


        servicoPais.eVizinho(suica, alemanha);
        System.out.println(servicoPais.eVizinho(suica, alemanha));
        servicoPais.listarVizinhos(suica);
        System.out.println(servicoPais.getDensidade(suica));


    }
}
