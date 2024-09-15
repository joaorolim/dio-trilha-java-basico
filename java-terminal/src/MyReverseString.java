public class MyReverseString {

    public static String capitalizeEachWord(String input) {
        if (input == null || input.isEmpty()) {
            return input; // Retorna a string original se for nula ou vazia
        }

        String[] words = input.split("\\s+"); // Divide a string por espaços em branco
        StringBuilder capitalized = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                // Capitaliza a primeira letra e coloca o restante em minúsculas
                capitalized.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }

        return capitalized.toString().trim(); // Remove o último espaço extra
    }

    public static String reverseString(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        String word = reversed.toString();

        return capitalizeEachWord(word);
    }


    public static void main(String[] args) {
        String palavra = "Paralelepipedo";

        System.out.println("Palavra original : " + palavra);
        System.out.println("Palavra invertida: " + reverseString(palavra));
    }
}