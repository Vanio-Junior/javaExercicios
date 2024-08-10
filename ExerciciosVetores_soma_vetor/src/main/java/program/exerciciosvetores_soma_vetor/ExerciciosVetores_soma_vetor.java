/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package program.exerciciosvetores_soma_vetor;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author vanio.oliveira
 */
public class ExerciciosVetores_soma_vetor {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quanto numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vetor = new double[n];
        double soma = 0.0;
        
        for(int i=0; i<n; i++){
            System.out.println("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }
        System.out.print("VALORES = ");
        for(int i=0; i<vetor.length; i++){
            System.out.print(vetor[i] + " ");
            soma = soma + vetor[i];
        }
        System.out.printf("%nSOMA = %.2f "
                + "%nMEDIA = %.2f", soma, (soma/vetor.length));
    }
}
