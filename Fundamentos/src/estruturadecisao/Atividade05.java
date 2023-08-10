

package estruturadecisao;

import java.util.Scanner;


public class Atividade05 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o modelo do veículo - "
                + "Fiat Argo (1), Fiat Mobi (2), Hyundai HB20 (3): ");
        int opcao = scanner.nextInt();
        
        double valorDiaria = 0.0;
        double valorKmRodado = 0.0;

        if (opcao == 1) {
            valorDiaria = 98.0;
            valorKmRodado = 2.39;
        } else if (opcao == 2) {
            valorDiaria = 79.0;
            valorKmRodado = 1.99;
        } else if (opcao == 3) {
            valorDiaria = 102.0;
            valorKmRodado = 2.99;
        } else {
            System.out.println("Opção inválida.");
            return;
        }

        System.out.print("Informe os dias de aluguel: ");
        int quantidadeDias = scanner.nextInt();

        System.out.print("Informe os quilômetros rodados: ");
        double kmRodados = scanner.nextDouble();

        double valorTotalDiarias = valorDiaria * quantidadeDias;
        double valorTotalKm = valorKmRodado * kmRodados;
        double valorTotalAluguel = valorTotalDiarias + valorTotalKm;

        System.out.println("Valor das diárias: R$" + valorTotalDiarias);
        System.out.println("Valor dos KM rodados: R$" + valorTotalKm);
        System.out.println("Valor do aluguel: R$" + valorTotalAluguel);

        scanner.close();
    }
}
