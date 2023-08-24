/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Aluno {

    private String nome;
    private String email;
    private int ra;

    private String acao;

    public Aluno(String nome, String email, int ra) {
        this.nome = nome;
        this.email = email;
        this.ra = ra;
        this.acao = "Descansando";
    }

    public void estudar() {
        this.acao = "Estudando";
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", email=" + email
                + ", ra=" + ra + ", acao=" + acao + '}';
    }

}
