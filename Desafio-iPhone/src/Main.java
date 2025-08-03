import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var iPhone = new iPhone();
        int option;

        while(true){
            System.out.println("Digite qual funcionalidade quer usar: ");
            System.out.println("1 - Tocar uma música");
            System.out.println("2 - Pausar uma música");
            System.out.println("3 - Selecionar uma música");
            System.out.println("4 - Realizar a chamada");
            System.out.println("5 - Desligar a chamada");
            System.out.println("6 - Atender");
            System.out.println("7 - Correio de Voz");
            System.out.println("8 - Exibir uma página");
            System.out.println("9 - Adicionar uma nova aba");
            System.out.println("10 - Atualizar a página");
            System.out.println("11 - Desligar o iPhone");
            option = scanner.nextInt();

            switch (option){
                case 1: iPhone.tocar();
                break;
                case 2: iPhone.pausar();
                break;
                case 3: System.out.println("Digite qual música deseja escutar: ");
                String musica = scanner.next();
                iPhone.selecionarMusica(musica);
                break;
                case 4: System.out.println("Digite o número que deseja ligar: ");
                String numero = scanner.next();
                iPhone.ligar(numero);
                break;
                case 5: iPhone.desligar();
                break;
                case 6: iPhone.atender();
                break;
                case 7: iPhone.iniciarCorreioVoz();
                break;
                case 8: System.out.println("Digite a aba que deseja exibir: ");
                String url = scanner.next();
                iPhone.exibirPagina(url);
                break;
                case 9: iPhone.adicionarNovaAba();
                break;
                case 10: iPhone.atualizarPagina();
                break;
                case 11: System.out.println("Desligando o iPhone");
                System.exit(0);
                break;
                default: System.out.println("Opção inválida, tente novamente!");
                break;
            }
        }
    }
}