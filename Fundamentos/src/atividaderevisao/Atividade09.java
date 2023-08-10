package atividaderevisao;

import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a quantidade de valores a serem informados: ");
        int quantidade = scanner.nextInt();
        double soma = 0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Digite o valor " + i + ": ");
            double valor = scanner.nextDouble();
            soma += valor;
        }
        
        double media = soma / quantidade;
        System.out.println("A média aritmética é: " + media);
        
    }
}
