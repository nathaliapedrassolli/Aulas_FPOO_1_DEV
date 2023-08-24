/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Escola {

    public static void main(String[] args) {

        Aluno aluno01 = new Aluno("Aluno01", "aluno01@email.com.br", 1234567);

        System.out.println(aluno01); 
        
        aluno01.estudar();
        
        System.out.println(aluno01);

    }
}
