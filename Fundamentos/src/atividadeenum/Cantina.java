/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeenum;

/**
 *
 * @author Aluno
 */
public class Cantina {
    
    private String sabor;
    private double valor;

    public Cantina(String sabor) {
        this.sabor = sabor;
    }

    @Override
    public String toString() {
        return "Cantina{" + "sabor=" + sabor + '}';
    }
    
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    
}
