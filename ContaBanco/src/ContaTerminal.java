import java.util.Scanner;

/**
 * ContaTerminal
 */
public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da agência: ");
        int numero = scanner.nextInt();

        System.out.println("Digite a agência (xxx-x): ");
        String agencia = scanner.next();

        System.out.println("Digite seu nome: ");
        String nome = scanner.next().toUpperCase();

        System.out.println("Digite seu saldo: ");
        float saldo = scanner.nextFloat();


        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nome, agencia, numero, saldo);
        
    }
}