/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeenum;

/**
 *
 * @author Aluno
 */
public class Meses {
    
     private String mes;
     private int valor;

    public Meses(String mes, int valor) {
        this.mes = mes;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Meses{" + "mes=" + mes + ", valor=" + valor + '}';
    }
     
     

}
