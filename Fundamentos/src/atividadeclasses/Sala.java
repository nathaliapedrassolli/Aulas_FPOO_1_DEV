/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeclasses;

/**
 *
 * @author Aluno
 */
public class Sala {
    
    private int numeroCadeiras;
    private int numeroMesas;
    private int numeroSala;
    private SalaEnum temProjetor;
    private int numeroComputadores;

    public Sala() {
        
    }
    

    public Sala(int numeroCadeiras, int numeroMesas, int numeroSala, SalaEnum temProjetor, int numeroComputadores) {
        this.numeroCadeiras = numeroCadeiras;
        this.numeroMesas = numeroMesas;
        this.numeroSala = numeroSala;
        this.temProjetor = temProjetor;
        this.numeroComputadores = numeroComputadores;
    }

    @Override
    public String toString() {
        return "Sala{" + "numeroCadeiras=" + numeroCadeiras + ", numeroMesas=" 
                + numeroMesas + ", numeroSala=" + numeroSala + ", temProjetor=" 
                + temProjetor + ", numeroComputadores=" + numeroComputadores + '}';
    }
    
}
