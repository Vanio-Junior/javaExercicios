/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciosvetores_mais_velho;

import entities.Pessoa;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author vanio
 */
public class ExerciciosVetores_mais_velho {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantas pessoas voce vai digitar? ");
        int qtdPessoa = sc.nextInt();
        Pessoa[] pessoas = new Pessoa[qtdPessoa];
        int posMaisVelho = 0;
        int idadeMaisVelho = 0;
        
        for(int i=0; i<qtdPessoa; i++){
            System.out.printf("Dados da %da pessoa: %n", i+1);
            String lixo = sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            if(idade > idadeMaisVelho){
                posMaisVelho = i;
                idadeMaisVelho = idade;
            }
            pessoas[i] = new Pessoa(nome, idade);
            
        }
        
        System.out.printf("PESSOA MAIS VELHA: %s", pessoas[posMaisVelho].getNome());
    }
}
