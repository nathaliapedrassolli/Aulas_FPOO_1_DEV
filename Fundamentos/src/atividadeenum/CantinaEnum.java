/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeenum;

/**
 *
 * @author Aluno
 */
public enum CantinaEnum {
    
    SALGADO_CARNE("Salgado de Carne"), SALGADO_QUEIJO("Salgado de Queijo"),
    SALGADO_CALABRESA("Salgado de Calabresa"), SALGADO_FRANGO("Salgado de"
    + "Frango"), SALGADO_BROCOLIS("Salgado de Brócolis"),
    SALGADO_SALSICHA("Salgado de Salsicha"), SALGADO_BAURU("Salgado"
    + "Bauru"), SALGADO_CHOCOLATE("Salgado de Chocolate");
    
    
    private String sabor;

    private CantinaEnum(String sabor) {
        this.sabor = sabor;
    }

    public String getSabor() {
        return this.sabor;
    }
  
    
}
