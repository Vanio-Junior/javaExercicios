/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio03poo;

import entities.Aluno;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author vanio.oliveira
 */
public class Exercicio03POO {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Aluno aluno = new Aluno();
        System.out.println("Entre com as informações do aluno: ");
        System.out.println("Nome: ");
        aluno.aluno = sc.nextLine();
        System.out.println("1º Trimestre: ");
        aluno.n1 = sc.nextDouble();
        System.out.println("2º Trimestre");
        aluno.n2 = sc.nextDouble();
        System.out.println("3º Trimestre");
        aluno.n3 = sc.nextDouble();
        
        System.out.println(aluno.toString());
        
        
    }
}
