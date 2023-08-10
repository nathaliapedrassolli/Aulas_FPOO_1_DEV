

package atividaderevisao;

import java.util.Scanner;


public class Atividade06 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor da casa:");
        double valorCasa = scanner.nextDouble();
        System.out.println("Informe o salário do comprador (R$):");
        double salario = scanner.nextDouble();
        System.out.println("Informe a quantidade de anos a pagar:");
        int anosPagar = scanner.nextInt();
        
        double prestacaoMax = salario * 0.30;
        double prestacao = valorCasa / (anosPagar * 12);

        if(prestacao <= prestacaoMax) {
            System.out.println("Empréstimo aceito.");
        } else {
            System.out.println("Empréstimo reprovado. O valor excede 30% do salário.");
        }
    }

}
