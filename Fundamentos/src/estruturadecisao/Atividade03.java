

package estruturadecisao;

import java.util.Scanner;


public class Atividade03 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de pessoas: ");
        int pessoas = scanner.nextInt();
        System.out.println("Escolha o prato - "
            + "Bife Acebolado (1), Filé de Frango (2), Brajola (3): ");
        int opcao = scanner.nextInt();
        
        double valor = 0;
        double preco = 0;
        
        if (opcao == 1) {
            preco = 19.99;
            valor = preco * pessoas;
            System.out.println("Seu almoço custará R$" + valor);
        } else if (opcao == 2) {
            preco = 18.99;
            valor = preco * pessoas;
            System.out.println("Seu almoço custará R$" + valor);
        } else if (opcao == 3) {
            preco = 23.99;
            valor = preco * pessoas;
            System.out.println("Seu almoço custará R$" + valor);
        }
        
    }
}
