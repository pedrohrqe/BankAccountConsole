import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.printf("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.printf("Por favor, digite o seu nome: ");
        String nomedoCliente = scanner.nextLine();

        System.out.printf("Por favor, digite o saldo depositado: ");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " + nomedoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
