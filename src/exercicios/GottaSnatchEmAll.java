package exercicios;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GottaSnatchEmAll {

    public static void main(String[] args){

        String[] cards = {"Newthree", "Newthree", "Newthree"};
        List<String> list = Arrays.asList(cards);

        Set<String> newCards = newCollection(list);

        System.out.println("Adiciona nova carta ? " +addCard("Scientuna", newCards));

        System.out.println("Atualizar cartas " +newCards);

        Set<String> theirCollection = Set.of("Scientuna");

        Set<String> myCollection = Set.of("Newthree");
        Set<String> theirCollection2 = Set.of("Scientuna");

        System.out.println("Nao tem cartas repetidas " +canTrade(myCollection, theirCollection2));

        List<Set<String>> setList = List.of(Set.of("Scientuna"), Set.of("Newthree","Scientuna"));

        Set<String> set = commonCards(setList);

        System.out.println("Cartas em comum " +set);

        System.out.println("Cartas que todos tem " +allCards(setList));

    }

    static Set<String> newCollection(List<String> cards) {
        Set<String> newCards = new HashSet<>();

        for (String card : cards){
            newCards.add(card);
        }

        return newCards;
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {

        if (myCollection.equals(theirCollection)) {
            return false;
        }

        if (myCollection.isEmpty() || theirCollection.isEmpty()) {
            return false;
        }

        if (myCollection.containsAll(theirCollection) || theirCollection.containsAll(myCollection)) {
            return false;
        }

        for (String item : myCollection) {
            if (!theirCollection.contains(item)) {
                return true;
            }
        }

        return false;
    }


    static Set<String> commonCards(List<Set<String>> collections) {
        if (collections == null || collections.isEmpty()) {
            return new HashSet<>();
        }

        Set<String> commonCards = new HashSet<>(collections.get(0));

        for (Set<String> collection : collections) {
            commonCards.retainAll(collection);
        }

        return commonCards;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> allDistinctCards = new HashSet<>();

        for (Set<String> collection : collections) {
            allDistinctCards.addAll(collection);
        }

        return allDistinctCards;
    }

}