/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeclasses;

/**
 *
 * @author Aluno
 */
public class SalaTeste {

    public static void main(String[] args) {

        Sala sala01 = new Sala(34, 34, 01,
                SalaEnum.TEM_PROJETOR, 35);
        
        System.out.println(sala01);
        
        Sala sala02 = new Sala(27, 27, 02, 
                SalaEnum.NAO_TEM_PROJETOR, 30);
        
        System.out.println(sala02);

    }
}
