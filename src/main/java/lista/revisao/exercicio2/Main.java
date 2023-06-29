package lista.revisao.exercicio2;

public class Main {
    public static void main(String[] args) {

            ServiceCandidato serviceCandidato = new ServiceCandidato();



            serviceCandidato.adicionar(123456L, 5.0);
            serviceCandidato.adicionar(12345678L, 3.0);


            serviceCandidato.listarCandidatos();

            serviceCandidato.excluirCandidato(12345678L);

            serviceCandidato.listarCandidatos();

    }


}
