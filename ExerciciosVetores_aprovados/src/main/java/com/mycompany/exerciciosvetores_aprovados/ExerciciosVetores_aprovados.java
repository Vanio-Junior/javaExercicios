/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciosvetores_aprovados;

import entities.Aluno;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author vanio
 */
public class ExerciciosVetores_aprovados {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos alunos serao digitados? ");
        int qtdAluno = sc.nextInt();
        Aluno[] vetorAluno = new Aluno[qtdAluno];
        
        for(int i=0; i<qtdAluno; i++){
            System.out.printf("Digite nome, primeira e segunda nota do %da aluno: %n", i+1);
            String lixo = sc.nextLine();
            String nome = sc.nextLine();
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            vetorAluno[i] = new Aluno(nome, n1, n2);
        }
        
        System.out.println("Alunos Aprovados: ");
        for(int i=0; i<vetorAluno.length; i++){
            if(vetorAluno[i].getMedia() >= 6){
                System.out.println(vetorAluno[i].getNome());
            }
        }
        
        
        
    }
}
