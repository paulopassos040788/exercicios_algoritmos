package estrutura_de_dados.linear;

public class TestOneArrayInsert {

    private static int[] insert (int[] array, int number, int index) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            if (i < index) {
                newArray[i] = array[i];
            } else {
                newArray[i + 1] = array[i];
            }
        }
        newArray[index] = number;
        return newArray;
    }

    public static void main(String[] args) {
        int[] array = {90, 70, 50, 80, 60, 85};
        array = insert(array, 75, 2);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
