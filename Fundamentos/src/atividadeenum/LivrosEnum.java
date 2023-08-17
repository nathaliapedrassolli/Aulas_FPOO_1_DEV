/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeenum;

/**
 *
 * @author Aluno
 */
public enum LivrosEnum {
    
    ROMANCE("Romance"), TERROR("Terror"), FICCAO("Ficção"), FANTASIA("Fantasia"),
        COMEDIA("Comédia");
        
        
        private String genero;
        
         private LivrosEnum(String genero) {
        this.genero = genero;
    }
    
    public String getStatus() {
        return this.genero;
    }
    
    
}
