

package atividaderevisao;

import java.util.Scanner;


public class Atividade05 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double distancia;
        double preco;
        System.out.println("Digite a distancia da viagem em Km: ");
        distancia = scanner.nextDouble();
        
        if (distancia <= 200) {
            preco = distancia * 0.50;
        } else {
            preco = distancia * 0.45;
        }
        
        System.out.println("O preço da passagem é R$" + preco);
        
    }

}
