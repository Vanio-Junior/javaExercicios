
import java.util.Locale;
import java.util.Scanner;
import util.CalculatorSalary;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author vanio.oliveira
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual a taxa do dollar? ");
        double tax = sc.nextDouble();
        System.out.println("Quantos dolares deseja comprar? ");
        double dollars = sc.nextDouble();
        double valor = CalculatorSalary.preco(tax, dollars);
        
        System.out.printf("Total do preço a ser pago: %.2f", valor);
        
    }
}
