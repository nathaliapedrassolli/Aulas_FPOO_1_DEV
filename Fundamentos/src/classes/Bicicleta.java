/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Bicicleta {
    
        // Atributos da Classe
    private int qtdeRodas;
    private boolean temMarchas;
    private int qtdeMarchas;
    private String modelo;
    private boolean temFreio;
    private String cor;
    private String situacao;
    private int velocidade = 0;

    // Construtor sem Argumentos
    public Bicicleta() {

    }

    // Construtor com Argumentos
    public Bicicleta(int qtdeRodas, boolean temMarchas, int qtdeMarchas,
            String modelo, boolean temFreio, String cor) {
        this.qtdeRodas = qtdeRodas;
        this.temMarchas = temMarchas;
        this.qtdeMarchas = qtdeMarchas;
        this.modelo = modelo;
        this.temFreio = temFreio;
        this.cor = cor;
        this.situacao = "Parada";
        this.velocidade = 0;
    }

    // Ações de Bicicleta
    public void andar(int velocidade) {
        this.situacao = "Andando";
        this.velocidade += 2;
    }
    
    public void freiar() {
        this.situacao = "Freiando";
        this.velocidade -= 1;
    }
    
    public boolean verificarSeTemFreio() {
        return this.temFreio;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "qtdeRodas=" + qtdeRodas + ", "
                + "temMarchas=" + temMarchas + ", qtdeMarchas=" + qtdeMarchas + 
                ", modelo=" + modelo + ", temFreio=" + temFreio + ", "
                + "cor=" + cor + ", situacao=" + situacao + ", "
                + "velocidade=" + velocidade + '}';
    }
    
    

}
