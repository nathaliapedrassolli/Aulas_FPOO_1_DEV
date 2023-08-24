/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeclasses;

/**
 *
 * @author Aluno
 */
public class Curso {
    
    private String nome;
    private String descricao;
    private CursoEnum categoria;

    public Curso() {
    }

    public Curso(String nome, String descricao, CursoEnum categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Curso{" + "nome=" + nome + ", descricao=" + descricao + 
                ", categoria=" + categoria + '}';
    }
    
    
    
}
