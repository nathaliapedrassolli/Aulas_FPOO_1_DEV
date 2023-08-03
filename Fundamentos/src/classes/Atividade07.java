

package classes;

import java.util.Scanner;


public class Atividade07 {
     public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe a quantidade de KW/h consumidos: ");
        double consumoKwh = scanner.nextDouble();

        System.out.print("Informe o tipo de instalação (R - Residência, C - Comércio, I - Indústria): ");
        char tipoInstalacao = scanner.next().charAt(0);

        double valorAPagar = 0.0;

        switch (Character.toUpperCase(tipoInstalacao)) {
            case 'R':
                if (consumoKwh <= 500) {
                    valorAPagar = consumoKwh * 0.40;
                } else {
                    valorAPagar = consumoKwh * 0.65;
                }
                break;
            case 'C':
                if (consumoKwh <= 1000) {
                    valorAPagar = consumoKwh * 0.55;
                } else {
                    valorAPagar = consumoKwh * 0.60;
                }
                break;
            case 'I':
                if (consumoKwh <= 5000) {
                    valorAPagar = consumoKwh * 0.55;
                } else {
                    valorAPagar = consumoKwh * 0.60;
                }
                break;
            default:
                System.out.println("Tipo de instalação inválido.");
                return;
        }

        System.out.printf("O valor a pagar será R$%.2f%n", valorAPagar);
    }
}