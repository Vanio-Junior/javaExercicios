/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciosvetores_abaixo_da_media;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author vanio
 */
public class ExerciciosVetores_abaixo_da_media {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();  
        double media = 0;
        Double[] vect = new Double[n];
        for(int i=0;i<n;i++){
            System.out.println("Digite um numero: ");
            double vetor = sc.nextDouble();
            media = media + vetor;
            vect[i] = vetor;            
        }
        media = media/n;
        System.out.printf("Media do vetor = %.3f %n", media);
        System.out.println("Elementos Abaixo da Media: ");
        for(int i=0; i<vect.length; i++){
            if(vect[i] < media){
                System.out.println(vect[i]);
            }
        }
        
    }
}
