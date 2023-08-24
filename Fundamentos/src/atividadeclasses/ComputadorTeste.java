/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeclasses;

/**
 *
 * @author Aluno
 */
public class ComputadorTeste {
    public static void main(String[] args) {
        
        Computador pc01 = new Computador(MemoriaEnum.OITO_GIGABYTES, 
                ProcessadorEnum.INTEL_I7, 32, 
                "Linux");
        
        System.out.println(pc01);
        
        Computador pc02 = new Computador(MemoriaEnum.DEZESSEIS_GIGABYTES, 
                ProcessadorEnum.INTEL_I5, 128, 
                "Windows");
                
        System.out.println(pc02);
        
        System.out.println("Eu não entendo de PC, Moisés! T-T");
        
    }
    
}
