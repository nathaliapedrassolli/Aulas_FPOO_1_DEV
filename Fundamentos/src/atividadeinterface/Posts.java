/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeinterface;

/**
 *
 * @author Aluno
 */
public class Posts implements ClassificacaoPost {
    
    private String usuario;
    private String titulo;
    private int curtidas;
    private int comentarios;
    private int repostas;
    private int estrelas;

    public Posts(String usuario, String titulo, int curtidas, int comentarios, int repostas, int estrelas) {
        this.usuario = usuario;
        this.titulo = titulo;
        this.curtidas = curtidas;
        this.comentarios = comentarios;
        this.repostas = repostas;
        this.estrelas = estrelas;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getComentarios() {
        return comentarios;
    }

    public void setComentarios(int comentarios) {
        this.comentarios = comentarios;
    }

    public int getReposts() {
        return repostas;
    }

    public void setReposts(int reposts) {
        this.repostas = reposts;
    }

    public int getEstrelas() {
        return estrelas;
    }

    public void setEstrelas(int estrelas) {
        this.estrelas = estrelas;
    }

    @Override
    public String toString() {
        return "Posts{" + "Nome de Usuário: " + usuario + ", Título: " + titulo + 
                ", Curtidas: " + curtidas + ", Comentários: " + comentarios + 
                ", Reposts: " + repostas + ", Estrelas: " + estrelas + '}';
    }

    @Override
    public int avaliarPostComum(int estrelas) {
        return COMUM;
    }    
    
    @Override
    public int avaliarPostLegal(int estrelas) {
        return LEGAL;
    }
    
    @Override
    public int avaliarPostMuitoLegal(int estrelas) {
        return SUPER_LEGAL;
    }
    
    
    
    
}

