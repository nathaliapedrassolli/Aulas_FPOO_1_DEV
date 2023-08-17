/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeenum;

/**
 *
 * @author Aluno
 */
public enum MesesEnum {
    
    JAN(1), FEV(2), MAR(3), ABR(4), MAI(5), JUN(6), JUL(7), AGO(8), SET(9), OUT(10), 
    NOV(11), DEZ(12);
    
    private int valor;
    
    private MesesEnum(int valor) {
        this.valor = valor;
    }
    
    public int getValor() {
    return valor;
    }
    
}
