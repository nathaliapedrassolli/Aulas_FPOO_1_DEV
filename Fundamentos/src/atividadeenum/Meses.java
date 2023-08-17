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
    
   private String meses;
   private int ano;

    public Meses(String meses) {
        this.meses = meses;
    }

    @Override
    public String toString() {
        return "Meses{" + "meses=" + meses + '}';
    }
   
   public void setMeses(String meses) {
        this.meses = meses;
    }
    
}
