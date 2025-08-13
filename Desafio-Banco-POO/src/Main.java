import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Cliente cliente1 = new Cliente();
        Conta contaCorrente = new ContaCorrente(cliente1);
        Conta contaPoupanca = new ContaPoupanca(cliente1);

        System.out.print("Digite seu nome: ");
        cliente1.setNome(input.nextLine());
        System.out.println(cliente1.getNome() + ", seja bem-vindo!");

        System.out.println("\nDigite sua conta: ");
        System.out.println("1 - Conta Corrente");
        System.out.println("2 - Conta Poupança");
        int tipoConta = input.nextInt();
        input.nextLine(); // limpar buffer

        Conta contaSelecionada = (tipoConta == 1) ? contaCorrente : contaPoupanca;

        while (true) {
            System.out.println("\nEscolha uma ação:");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Transferir");
            System.out.println("4 - Imprimir Extrato");
            System.out.println("5 - Sair");
            int opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Valor do saque: ");
                    double valor = input.nextDouble();
                    input.nextLine();
                    contaSelecionada.sacar(valor);
                }
                case 2 -> {
                    System.out.print("Valor do depósito: ");
                    double valor = input.nextDouble();
                    input.nextLine();
                    contaSelecionada.depositar(valor);
                }
                case 3 -> {
                    System.out.print("Valor da transferência: ");
                    double valor = input.nextDouble();
                    input.nextLine();
                    System.out.print("Nome do destinatário: ");
                    Cliente cliente2 = new Cliente();
                    cliente2.setNome(input.nextLine());
                    Conta contaDestino = (tipoConta == 1)
                            ? new ContaCorrente(cliente2)
                            : new ContaPoupanca(cliente2);
                    contaSelecionada.transferir(valor, contaDestino);
                    System.out.println("Transferência de " + valor + " para " + cliente2.getNome() + " realizada!");
                }
                case 4 -> contaSelecionada.imprimirExtrato();
                case 5 -> {
                    System.out.println("Saindo do sistema. Até logo!");
                    input.close();
                    return;
                }
                default -> System.out.println("Opção inválida!");
            }
        }
    }
}