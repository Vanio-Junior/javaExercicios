/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author vanio
 */
public class Aluno {
    private String Nome;
    private double n1;
    private double n2;

    public double getMedia() {
        return ((n1+n2)/2);
    }


    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public Aluno(String Nome, double n1, double n2) {
        this.Nome = Nome;
        this.n1 = n1;
        this.n2 = n2;
    }
    
    
    
}
