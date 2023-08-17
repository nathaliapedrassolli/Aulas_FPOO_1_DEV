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
    
   JANEIRO("Janeiro"), FEVEREIRO("Fevereiro"), MARCO("Março"), ABRIL("Abril"), 
   MAIO("Maio"), JUNHO("Junho"), JULHO("Julho"), AGOSTO("Agosto"), SETEMBRO("Setembro"), 
   OUTUBRO("Outubro"), NOVEMBRO("Novembro"), DEZEMBRO("Dezembro");
   
   private String meses;

    private MesesEnum(String meses) {
        this.meses = meses;
    }

    public String getMeses() {
        return this.meses;
    }
   
   
    
}
