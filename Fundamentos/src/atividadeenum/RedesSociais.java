/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeenum;

/**
 *
 * @author Aluno
 */
public class RedesSociais {
    
    private String redes;

    public RedesSociais(String redes) {
        this.redes = redes;
    }

    @Override
    public String toString() {
        return "RedesSociais{" + "redes=" + redes + '}';
    }
    
       public void setRedes(String redes) {
        this.redes = redes;
    }
    
}
