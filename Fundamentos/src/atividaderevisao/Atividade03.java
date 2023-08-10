

package atividaderevisao;

import java.util.Scanner;


public class Atividade03 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a velocidade do carro:");
        float velocidade = scanner.nextFloat();
        
        if(velocidade > 80) {
            System.out.println("Você foi multado.");
            // Multa = R$5.00 para cada Km acima do limite
            float multa = (velocidade - 80) * 5;
            System.out.println("A multa custará " + multa);
        } else {
            System.out.println("Não ultrapasse a velocidade permitida.");
        }
        
    }

}
