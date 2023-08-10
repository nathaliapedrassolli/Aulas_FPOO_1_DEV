

package estruturadecisao;

import java.util.Scanner;


public class Atividade01 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu cargo - "
                + "Gerente(G), Supervisor(S), Técnico(T), Auxiliar(A): ");
        
        char cargo = scanner.nextLine().toUpperCase().charAt(0);

        double salario = 0;
        double INSS = 0;
        double convenio = 0;
        double salarioFinal = 0;

        if (cargo == 'G') {
            salario = 5590.0;
            INSS = 0.92;
            convenio = 289;
            salarioFinal = salario * INSS - convenio;
            System.out.println("Seu salário no cargo de Gerente será R$" + salarioFinal);
        } 
        else if (cargo == 'S') {
            salario = 4128.0;
            INSS = 0.93;
            convenio = 239;
            salarioFinal = salario * INSS - convenio;
            System.out.println("Seu salário no cargo de Supervisor será R$" + salarioFinal);
        }
        else if (cargo == 'T') {
            salario = 3789.0;
            INSS = 0.96;
            convenio = 189;
            salarioFinal = salario * INSS - convenio;
            System.out.println("Seu salário no cargo de Técnico será R$" + salarioFinal);
        }
        else if (cargo == 'A') {
            salario = 2345.0;
            INSS = 0.98;
            convenio = 156;
            salarioFinal = salario * INSS - convenio;
            System.out.println("Seu salário no cargo de Auxiliar será R$" + salarioFinal);
        }
        
    }
}
