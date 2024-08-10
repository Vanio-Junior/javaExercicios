/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package program.exerciciosvetores_pensionato;

import entities.Quarto;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author vanio.oliveira
 */
public class ExerciciosVetores_pensionato {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Quarto[] quartos = new Quarto[10];
        
        System.out.println("How many rooms will be rented? ");
        int nLocatarios = sc.nextInt();
        int quartosOcupados = 0;
        
        while(quartosOcupados != nLocatarios){
            System.out.printf("Rent #%d %n", quartosOcupados+1);
            System.out.print("Name: ");            
            String lixo = sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int quarto = sc.nextInt();
            
            
            if(quarto <= 9){
                if(quartos[quarto] != null){
                    System.out.printf("Room %d is already occupied%n", quarto);
                }
                else{
                    quartos[quarto] = new Quarto(name, email);
                    quartosOcupados++;
                }
            }
            else{
                System.out.printf("The room %d doesn't exist%n", quarto);
            }
            
           
        }
        System.out.println("Busy Rooms");
        for(var i=0; i<quartos.length; i++){
            if(quartos[i] != null){
                System.out.printf("%d: %s %n",i,quartos[i].getQuartoinfo());
            }
        }
    }
}
