import exception.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        var Scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = Scanner.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = Scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException ex) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("Parâmetros inválidos");
        }

        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++) {
                System.out.printf("Imprimindo o número %s\n", i);
        }
    }
}
