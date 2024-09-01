import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            // Solicitar dados do usuário
            System.out.print("Por favor, digite o número da Conta: ");
            int numero = scanner.nextInt();

            System.out.print("Por favor, digite o número da Agência: ");
            String agencia = scanner.next();

            // Limpar o buffer do Scanner para evitar problemas com a leitura da próxima linha
            scanner.nextLine();

            System.out.print("Por favor, digite o nome do Cliente: ");
            String nomeCliente = scanner.nextLine();

            System.out.print("Por favor, digite o saldo inicial: ");
            double saldo = scanner.nextDouble();

            // Exibir mensagem personalizada
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                                ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

            // Menu de opções
            System.out.println("Digite 'sair' para encerrar o programa ou qualquer outra tecla para continuar.");
            String input = scanner.next();

            if (input.equalsIgnoreCase("sair")) {
                continuar = false;
                System.out.println("Encerrando o programa. Obrigado por utilizar nosso sistema.");
            }
        }

        scanner.close();
    }
}
