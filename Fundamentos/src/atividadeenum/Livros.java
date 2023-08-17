/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeenum;

/**
 *
 * @author Aluno
 */
public class Livros {
        
    private String titulo;
    private String genero;

    public Livros(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Livros{" + "titulo=" + titulo + ", genero=" + genero + '}';
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
