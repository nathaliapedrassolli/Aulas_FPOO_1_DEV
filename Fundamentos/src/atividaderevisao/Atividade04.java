package atividaderevisao;



import java.util.Scanner;




public class Atividade04 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu salário:");
        float salario = scanner.nextFloat();
        
        if(salario > 1350) {
            System.out.println("Seu percentual de aumento é de 10%.");
            float aumento = (10 * salario) / 100;
            System.out.println("Seu salário terá um aumento de R$" + aumento + ".");
        } else {
            System.out.println("Seu percentual de aumento é de 15%.");
            float aumento = (15 * salario) / 100;
            System.out.println("Seu salário tera um aumento  de R$" + aumento + ".");
        }
        
    }

}
