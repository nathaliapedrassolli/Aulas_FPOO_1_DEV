/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeenum;

/**
 *
 * @author Aluno
 */
public enum RedesSociaisEnum {
    
    INSTAGRAM("Instagram"), FACEBOOK("Facebook"), TWITTER("Twitter");
    
    private String redes;

    private RedesSociaisEnum(String redes) {
        this.redes = redes;
    }

    public String getRedes() {
        return this.redes;
    }
    
    
}
