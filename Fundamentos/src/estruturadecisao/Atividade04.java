

package estruturadecisao;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Atividade04 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o item que voce deseja comprar - "
                + "Notebook Lenovo (1), Celular MotoG22  (2), Carro Hb20 (3), Apartamento (4): ");

        System.out.print("Opcao: ");
        int opcao = scanner.nextInt();

        double valorTotal = 0.0;
        double percentualEconomizar = 0.0;

        if (opcao == 1) {
            valorTotal = 3299.0;
            percentualEconomizar = 0.05;
        } else if (opcao == 2) {
            valorTotal = 1789.0;
            percentualEconomizar = 0.10;
        } else if (opcao == 3) {
            valorTotal = 68000.0;
            percentualEconomizar = 0.02;
        } else if (opcao == 4) {
            valorTotal = 180000.0;
            percentualEconomizar = 0.01;
        } else {
            System.out.println("Opção inválida.");
            return;
        }

        double valorEconomizadoPorMes = valorTotal * percentualEconomizar;
        
        DecimalFormat df = new DecimalFormat("#.00");
        String valorEconomizadoPorMesFormatado = "R$" + df.format(valorEconomizadoPorMes);

        int quantidadeMeses = (int) Math.ceil(valorTotal / valorEconomizadoPorMes);

        System.out.println("Para comprar o item escolhido, você deve economizar R$" + valorEconomizadoPorMesFormatado + " por " + quantidadeMeses + " meses.");

        scanner.close();
    }
}