/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aux.exerciciosvetores_soma_vetores;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author vanio.oliveira
 */
public class ExerciciosVetores_soma_vetores {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();
        
        int[] vetor1 = new int[n];
        int[] vetor2 = new int[n];
        
        System.out.println("Digite os Valores do Vetor A: ");
        for(int i=0; i<n; i++){
            vetor1[i] = sc.nextInt();
        }
        System.out.println("Digite os Valores do Vetor B: ");
        for(int i=0; i<n; i++){
            vetor2[i] = sc.nextInt();
        }
        System.out.println("VETOR RESULTANTE: %n");
        for(int i=0; i<n; i++){
            System.out.printf("%d %n", (vetor1[i] + vetor2[i]));
        }
        
    }
}
