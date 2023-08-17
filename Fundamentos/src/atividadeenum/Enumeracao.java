/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeenum;

/**
 *
 * @author Aluno
 */
public class Enumeracao {

    public static void main(String[] args) {

        Meses meses = new Meses("JAN", MesesEnum.JAN.getValor());
        System.out.println(meses); 
        
        meses.setMeses(FEV, MesesEnum.FEV.getValor());
        
    }

}
