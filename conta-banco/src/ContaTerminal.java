import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        var scanner  = new Scanner(System.in);
        System.out.println("Por favor, digite o nome do Usuário !");
        var nome = scanner.nextLine();
        System.out.println("Por favor, digite o número da Agência !");
        var agencia = scanner.nextLine();
        System.out.println("Por favor, digite o número do Usuário !");
        var conta = scanner.nextInt();
        System.out.println("Por favor, digite o Saldo !");
        var saldo = scanner.nextFloat();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque. %n",  nome, agencia, conta, saldo);
    }
}