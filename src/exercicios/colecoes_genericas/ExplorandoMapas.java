package exercicios.colecoes_genericas;

import java.util.Map;
import java.util.TreeMap;

public class ExplorandoMapas {

    private final static Map<String, String> paisesCapitais = new TreeMap<>();

    public static void main(String[] args) {

        paisesCapitais.put("Brasil", "Brasília");
        paisesCapitais.put("França", "Paris");
        paisesCapitais.put("Japão", "Tóquio");
        paisesCapitais.put("Argentina", "Buenos Aires");
        paisesCapitais.put("Egito", "Cairo");

        System.out.println("\n Paises e Capitais:");
        imprimirMapas(paisesCapitais);

        paisesCapitais.remove("Brasil");

        System.out.println("\n Paises e Capitais:");
        imprimirMapas(paisesCapitais);

        System.out.println(paisesCapitais.get("Egito"));
    }

    private static void imprimirMapas(Map<String, String> mapas) {

        for (Map.Entry<String, String> entry : mapas.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }


}
