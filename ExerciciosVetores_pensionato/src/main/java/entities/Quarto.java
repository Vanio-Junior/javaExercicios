/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author vanio.oliveira
 */
public class Quarto {
    private String name;
    private String email;

    public Quarto(String name, String email) {
        this.name = name;
        this.email = email;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getQuartoinfo() {
        String dadosQuarto = String.format(name+", "+email);
        return dadosQuarto;
    } 
    
    
}
