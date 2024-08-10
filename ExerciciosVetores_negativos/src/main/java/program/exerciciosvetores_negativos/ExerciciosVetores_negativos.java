/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package program.exerciciosvetores_negativos;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author vanio.oliveira
 */
public class ExerciciosVetores_negativos {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos numero voce vai digitar? ");
        int n = sc.nextInt();
        int[] vetor = new int[n];
        
        
        for(var i=0; i<n; i++){
            System.out.println("Digite um numero: ");
            int valor = sc.nextInt();
            vetor[i] = valor;
        }
        System.out.println("NUMEROS NEGATIVOS: ");
        for(int i=0; i<vetor.length; i++){
            if(vetor[i] < 0){
                System.out.println(vetor[i]);
            }
        }
        sc.close();
    }
}
