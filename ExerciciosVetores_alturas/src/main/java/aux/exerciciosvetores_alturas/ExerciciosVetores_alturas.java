/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aux.exerciciosvetores_alturas;

import entities.Pessoa;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author vanio.oliveira
 */
public class ExerciciosVetores_alturas {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        double mediaAltura = 0;
        int qtdMenores = 0;
        
        Pessoa[] vetorPessoas = new Pessoa[n];
        for(int i=0; i<n; i++){
            System.out.printf("Dados da %da pessoa: %n", i+1);
            System.out.printf("Nome: %n");
            String lixo = sc.nextLine();
            String nome = sc.nextLine();
            System.out.printf("Idade: ");
            int idade = sc.nextInt();
            if(idade <16){
                qtdMenores++;
            }
            System.out.printf("Altura: %n");
            double altura = sc.nextDouble();
            mediaAltura = mediaAltura + altura;
            
            vetorPessoas[i] = new Pessoa(nome, idade, altura);
        }
        
        System.out.printf("Altura Media: %.2f %n", mediaAltura/n);
        double porc = (qtdMenores/ (double) n);
        System.out.printf("Pessoas com menos de 16 anos: %.2f% %n", porc*100);
        
        for(int i=0;i<vetorPessoas.length;i++){
            if(vetorPessoas[i].getIdade() < 16){
                System.out.printf("%s %n", vetorPessoas[i].getNome());
            }
        }
        
    }
}
