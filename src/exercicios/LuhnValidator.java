package exercicios;

public class LuhnValidator {

    public static boolean isValid(String number) {
        number = number.replaceAll("\\D", "");

        if (number.length() <= 1) {
            return false;
        }

        int[] digits = new int[number.length()];
        for (int i = 0; i < number.length(); i++) {
            digits[i] = Character.getNumericValue(number.charAt(i));
        }

        for (int i = digits.length - 2; i >= 0; i -= 2) {
            int doubledValue = digits[i] * 2;
            if (doubledValue > 9) {
                doubledValue -= 9;
            }
            digits[i] = doubledValue;
        }

        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }

        return sum % 10 == 0;
    }

    public static void main(String[] args) {
        String cardNumber = "4567890123456789"; // Exemplo de número de cartão
        if (isValid(cardNumber)) {
            System.out.println("O número de cartão é válido.");
        } else {
            System.out.println("O número de cartão é inválido.");
        }
    }
}




