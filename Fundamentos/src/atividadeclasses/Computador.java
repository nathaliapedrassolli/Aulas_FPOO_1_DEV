/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeclasses;

/**
 *
 * @author Aluno
 */
public class Computador {
    
    private MemoriaEnum memoria;
    private ProcessadorEnum processador;
    private int capacidadeHD;
    private String sistemaOperacional;

    public Computador() {
    }

    public Computador(MemoriaEnum memoria, ProcessadorEnum processador, int capacidadeHD, String sistemaOperacional) {
        this.memoria = memoria;
        this.processador = processador;
        this.capacidadeHD = capacidadeHD;
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public String toString() {
        return "Computador{" + "memoria=" + memoria + ", processador=" + 
                processador + ", capacidadeHD=" + capacidadeHD + 
                ", sistemaOperacional=" + sistemaOperacional + '}';
    }

}
