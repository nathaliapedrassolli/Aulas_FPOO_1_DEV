/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Carro {
    
    private String modelo;
    private String marca;
    private String cor;
    private int ano;
    private int rodas;
    
    private String acao;
    private int velocidade;

    public Carro(String modelo, String marca, String cor, int ano, int rodas) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.rodas = rodas;
        this.acao = "Parado";
        this.velocidade = 0;
    }
    
    
    public void andar(int velocidade) {
        this.acao = "Andando";
        this.velocidade += 2;
    }
    
    public void freiar() {
        this.acao = "Freiando";
        this.velocidade -= 1;
    }

    @Override
    public String toString() {
        return "Carro{" + "modelo=" + modelo + ", marca=" + marca + 
                ", cor=" + cor + ", ano=" + ano + ", rodas=" + rodas + 
                ", acao=" + acao + ", velocidade=" + velocidade + '}';
    }
    
    
    
    
    
}
