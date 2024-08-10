/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package program.exerciciomatriz;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author vanio.oliveira
 */
public class ExercicioMatriz {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o numero de linhas da Matriz: ");
        int linha = sc.nextInt();
        System.out.println("Digite o numero de colunasda Matriz: ");
        int coluna = sc.nextInt();
        int[][] matriz = new int[linha][coluna];
        
        for(int i=0; i<linha ;i++){
            for(int l=0; l<coluna; l++){
                System.out.printf("Digite o %da numero da linha %da %n", l+1,i+1);
                int valor = sc.nextInt();
                matriz[i][l] = valor;
            }
        }
        System.out.println("Qual o numero procurado? ");
        int valorProcurado = sc.nextInt();
        
        for(int i=0; i<linha; i++){
            for(int l=0; l<coluna; l++){
                if(matriz[i][l] == valorProcurado){
                    System.out.printf("Posicao: %d,%d %n", i,l);
                    //esquerda
                    if(l-1 >= 0){
                        System.out.println("Esquerda: " + matriz[i][l-1]);
                    }
                    //cima
                    if(i-1 >= 0){
                        System.out.println("cima: " + matriz[i-1][l]);
                    }
                    //direita
                    if(l+1 < coluna){
                        System.out.println("direita: " + matriz[i][l+1]);
                    }
                    //baixo
                    if(i+1 < linha){
                        System.out.println("baixo: " + matriz[i+1][l]);
                    }
                    
                }
            }
        }
    }
}
