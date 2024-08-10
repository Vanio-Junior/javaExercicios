/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciofixacaovetores;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author vanio
 */
import entities.Pessoa;
public class ExercicioFixacaoVetores {

    public static void main(String[] args) {       
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantas pessoas serao digitas?");
        int n = sc.nextInt();              
        double mediaBruta =0;
        double menorAltura = 0;
        double maiorAltura = 0;
        int nMulheres = 0;
        
        Pessoa[] vect = new Pessoa[n];
        
        for(int i=0; i<n; i++){
            System.out.printf("Altura da %da pessoa: ", i+1);
            double altura = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ", i+1);
            String lixo = sc.nextLine();
            char sexo = sc.nextLine().charAt(0);
            vect[i] = new Pessoa(altura, sexo);
            if(sexo == 'f'){
                mediaBruta = mediaBruta + altura;
                nMulheres++;
            }
            if(i==0){
                menorAltura = altura;
                maiorAltura = altura;
            }
            if(altura < menorAltura){
                menorAltura = altura;
            }
            if(altura > maiorAltura){
                maiorAltura = altura;
            }
        }
        
        System.out.printf("Menor Altura = %.2f %n", menorAltura);
        System.out.printf("Maior Altura = %.2f %n", maiorAltura);
        System.out.printf("media da Alturas da Mulheres = %.2f %n", mediaBruta/nMulheres);
        System.out.printf("Numero de Homens = %d %n", (n-nMulheres));
        
    }
}