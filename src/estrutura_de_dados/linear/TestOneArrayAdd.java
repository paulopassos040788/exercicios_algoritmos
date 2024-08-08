package estrutura_de_dados.linear;

public class TestOneArrayAdd {

    private static int[] add (int[] array, int number) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = number;
        return newArray;
    }

    public static void main(String[] args) {
        int[] array = {90, 70, 50, 80, 60, 85};
        array = add (array, 75);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }

}
