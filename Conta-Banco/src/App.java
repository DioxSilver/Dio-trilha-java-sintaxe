import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println();
        
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();

        System.out.println("agencia: " + agencia);

        System.out.println("Por favor, digite o numero da conta!");
        int numeroConta = scanner.nextInt();
        System.out.println("Numero da conta: " + numeroConta);

        System.out.println("Por favor, informe seu nome! ");
        String nomeCliente = scanner.next();
        System.out.println("Olá, senhor: " + nomeCliente);
        
        System.out.println("Por favor, infome seu saldo");
        Double saldo = scanner.nextDouble();

        System.out.println("saldo atual " + saldo);

        System.out.println("Olá "+nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta " +numeroConta+" e seu saldo "+ saldo +" já está disponível para saque");

    }
}
final
