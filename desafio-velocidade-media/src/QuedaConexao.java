import java.util.Scanner;

public class QuedaConexao {

    // Função para verificar queda de conexão
    public static String verificarQuedaConexao(String[] velocidades) {
        // Itera sobre a lista de velocidades
        for (String velocidade : velocidades) {
            // Converte a string para inteiro e verifica se é 0
            if (Integer.parseInt(velocidade.trim()) == 0) {
                return "Queda de Conexao"; // Retorna "Queda de Conexao" se encontrar 0
            }
        }
        return "Sem Quedas"; // Se não encontrar 0, retorna "Sem Quedas"
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        // Verificando se houve queda de conexão
        String resultado = verificarQuedaConexao(velocidades);

        // Exibindo o resultado da verificação
        System.out.println(resultado);

        scanner.close();
    }
}