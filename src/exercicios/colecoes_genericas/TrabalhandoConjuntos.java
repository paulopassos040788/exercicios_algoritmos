package exercicios.colecoes_genericas;

import java.util.*;

public class TrabalhandoConjuntos {

    private final static String[] cidades = {"Sao Paulo", "Sao Paulo", "Sao Paulo", "Goiania", "Curitiba", "Salvador", "Trindade"};
    private final static Set<String> cidadesSet = new TreeSet<>();

    public static void main(String[] args) {

        adicionaCidade(cidades);

        pesquisaCidade("Goiania");

        imprimeCidades(cidadesSet);

    }

    private static void adicionaCidade(String[] cidades) {
        cidadesSet.addAll(Arrays.asList(cidades));
    }

    private static void pesquisaCidade(String cidade) {
        if (cidadesSet.contains(cidade)){
            System.out.printf("Cidade de %s contem na lista", cidade);
        } else {
            System.out.println("cidade nao encontrada");
        }
    }

    private static void imprimeCidades(Set<String> cidades) {
        System.out.println("\nLista de cidades: ");
        for (String cidade : cidades) {
            System.out.println(cidade);
        }
    }

}
