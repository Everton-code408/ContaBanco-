import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Nome da Agencia: ");
        String nomeAgencia = scanner.nextLine();

        System.out.print("Numero da Conta: ");
        int numeroConta = Integer.parseInt(scanner.nextLine());

        System.out.print("Saldo da Conta: ");
        double saldoConta = Double.parseDouble(scanner.nextLine());

        System.out.print(" Olá "+nomeCliente+" Obrigado por criar uma conta em nosso banco, sua agência é "+nomeAgencia+" conta "+numeroConta+" e seu saldo "+saldoConta+" já está disponível para saque.");
    }
}
