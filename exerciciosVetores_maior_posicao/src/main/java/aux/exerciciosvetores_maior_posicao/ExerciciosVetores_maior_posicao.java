/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aux.exerciciosvetores_maior_posicao;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author vanio.oliveira
 */
public class ExerciciosVetores_maior_posicao {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double maiorNumero = 0.0;
        int posicao = 0;
        
        double vect[] = new double[n];
        for(int i=0; i<n; i++){
            System.out.println("Digite um numero: ");
            double numero = sc.nextDouble();
            vect[i]= numero;
            if(i ==0){
                maiorNumero = numero;
                posicao = i;
            }
            if(numero > maiorNumero){
                maiorNumero = numero;
                posicao = i;
            }
        }
        
        System.out.printf("MAIOR VALOR = %.2f %n", maiorNumero);
        System.out.printf("POSICAO DO MAIOR VALOR = %d", posicao);
        
    }
}
