package atividaderevisao;

import java.util.Scanner;




public class Atividade02 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do produto:");
        String nomeProduto = scanner.nextLine();
        System.out.println("Digite o valor unitário do produto:");
        double valorProduto = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite a quatidade de produto:");
        int quantProduto = Integer.parseInt(scanner.nextLine());
        
        double valorTotal = valorProduto * quantProduto;
        
        System.out.println("Informe a forma de pagamento (C para Crédito, D para Débito:");
        String formaPagamento = scanner.nextLine();
        
        if(formaPagamento.equalsIgnoreCase("D")) {
            double desconto = 0;
            if(valorTotal <= 100) {
                desconto = valorTotal * 0.05;
            } else {
                desconto = valorTotal * 0.03;
            }
            valorTotal -= desconto;
            System.out.println("Valor total com desconto: " +valorTotal);
        } else if(formaPagamento.equalsIgnoreCase("C")) {
            System.out.println("Digite o número de parcelas:");
            int numeroParcelas = Integer.parseInt(scanner.nextLine());
            double valorParcela = valorTotal / numeroParcelas;
            System.out.println("Valor da parcela: R$" + valorParcela + ".");
        } else {
            System.out.println("Forma de pagamento inválida.");
        }
        
        System.out.println("Informações do produto:");
        System.out.println("Nome: " + nomeProduto);
        System.out.println("Valor Unitário: R$" + valorProduto);
        System.out.println("Quantidade: " + quantProduto);
        System.out.println("Valor Total: R$" + valorTotal);
        
    }

}
