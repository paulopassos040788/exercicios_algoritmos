package exercicios.colecoes_genericas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManipulandoListas {
    private static final Integer[] numeros = {45, 78, 5, 10, 2, 7, 100, 56, 41};
    private static final List<Integer> listaInteiros = new ArrayList<>();

    public static void main(String[] args) {
        
        for(Integer numero : numeros){
            adicionarElementos(numero);
        }

        printLista(listaInteiros);

        ordenarLista(listaInteiros);
        printLista(listaInteiros);

        removerElementoNaPosicao(2);
        printLista(listaInteiros);

        segundoElementoEultimo(listaInteiros);

    }

    private static void adicionarElementos(int numero){
        listaInteiros.add(numero);
    }

    private static void removerElementoNaPosicao(int posicao){
        ManipulandoListas.listaInteiros.remove(posicao);
    }

    private static void ordenarLista(List<Integer> lista){
        Collections.sort(lista);
    }

    private static void segundoElementoEultimo(List<Integer> lista){
        int segundo = lista.get(1);
        int ultimo = lista.get(lista.size() - 1);

        System.out.println("\nSegundo elemento: " + segundo);
        System.out.println("\nUltimo elemento: " + ultimo);
    }

    private static void printLista(List<Integer> lista){
        System.out.println("\nLista de numeros: ");
        for(Integer numero : lista){
            System.out.printf("\n%d ", numero);
        }
    }
    
}
