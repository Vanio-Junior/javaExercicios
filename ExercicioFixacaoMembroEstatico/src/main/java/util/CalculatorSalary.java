/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author vanio.oliveira
 */
public class CalculatorSalary {
    public static double iof = 1.06;
    
    public static double preco (double tax, double dollars){
        return  (dollars*tax*iof);
    }
}
