package lista.exercicio007;

import lista.revisao.exercicio2.ServiceCandidato;

public class Main {

    public static void main(String[] args) {
        // Instanciando objetos:

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


        // Testando método que informe se outro país é vizinho:
        System.out.println("São vizinhos: " + servicoPais.eVizinho(suica, alemanha));

        // Testando método que dado um país informa a sua população:
        System.out.printf("População: %,d" ,servicoPais.getDensidade(suica));

        // Testando método que lista vizinhos:
        servicoPais.listarVizinhos(suica);


    }
}
