/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conta;

/**
 *
 * @author vanio.oliveira
 */
public class Conta {
    private String nome;
    private int nConta;
    private double saldo = 0.0;
    private double taxa = 5.0;

    public double getTaxa() {
        return taxa;
    }    
    public Conta(String nome, int nConta){
        this.nome = nome;
        this.nConta = nConta;
    } 
    /*public Conta(String nome, int nConta, double saldo){
        this.nome = nome;
        this.nConta = nConta;
        this.saldo = saldo;
    }*/
        
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getnConta() {
        return nConta;
    }
    
    
    public double getSaldo() {
        return saldo;
    }

    public void deposito(double deposito) {
        saldo = saldo + deposito;
    }
    public void saque(double saque) {
        saldo = saldo - saque - taxa;
    }
    public String toString(){
        return String.format("Account %d, Holder: %s, Balance: $%.2f%n", nConta, nome, saldo);
    }
    
    
}
