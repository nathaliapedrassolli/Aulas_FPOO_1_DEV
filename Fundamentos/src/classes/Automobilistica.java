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

        Carro volkswagenPolo = new Carro("Polo", "Volkswagen", 
                CorEnum.VERMELHO, 2023, 4, 
                MarchaEnum.NEUTRO);
        
        Carro fiatUno = new Carro("Fiat", "Uno", 
                CorEnum.PRATA, 2010, 4, 
                MarchaEnum.PRIMEIRA_MARCHA);

        System.out.println(volkswagenPolo);
        
        volkswagenPolo.ligar();
        volkswagenPolo.trocarMarcha(MarchaEnum.MARCHA_RE);
        volkswagenPolo.trocarMarcha(MarchaEnum.PRIMEIRA_MARCHA);
        
        volkswagenPolo.acelerar(20);
        volkswagenPolo.acelerar(30);
        
        System.out.println(volkswagenPolo);
        System.out.println(fiatUno);

    }
}
