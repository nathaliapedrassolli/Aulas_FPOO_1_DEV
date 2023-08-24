/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Automobilistica {
    public static void main(String[] args) {
        
        Carro volkswagenPolo = new Carro("Volkswagen Polo", 
                "Volkswagen", "Vermelho", 2023, 4);
        
        System.out.println(volkswagenPolo);
        
        volkswagenPolo.andar(10);
        volkswagenPolo.andar(20);
        volkswagenPolo.andar(30);

        System.out.println(volkswagenPolo);
        
    }
    
}
