/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aux.exerciciosvetores_media_pares;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author vanio.oliveira
 */
public class ExerciciosVetores_media_pares {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos elementosvai ter o vetor? ");
        int n = sc.nextInt();
        int[] vetor = new int[n];
        double media = 0.0;
        int npares = 0;
        
        for(int i=0;i<n; i++){
            System.out.println("Digite um numero: ");
            int valor = sc.nextInt();
            vetor[i] = valor;
            if(valor % 2 ==0){
                media = media + (double)valor;
                npares++;
            }
            
        }
        String resultado = "NENHUM NUMERO PAR";
        if(npares > 0){
            resultado = String.format("MEDIA DOS PARES %.1f", (media/ (double)npares));
        }
        
        
        System.out.println(resultado);
    }
}
