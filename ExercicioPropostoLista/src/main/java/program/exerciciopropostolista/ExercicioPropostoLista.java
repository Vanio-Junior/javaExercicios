/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package program.exerciciopropostolista;

import entities.Funcionario;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author vanio.oliveira
 */
public class ExercicioPropostoLista {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<Funcionario> listFunc = new ArrayList<>();
        System.out.print("How Many Employees will be registered? ");
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++){
            System.out.printf("Employee #%d %n", i+1);
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String lixo = sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            listFunc.add(new Funcionario(id, name, salary));
        }
        
        System.out.print("Enter the employee Id that will have salary increase: ");
        int id = sc.nextInt();
        List<Funcionario> funcAumento = listFunc.stream().filter(x -> x.getId() == id).collect(Collectors.toList());
        if(funcAumento.size() == 0){
            System.out.printf("Employee %d does not exist, operation aborted", id);
        }
        else{
            System.out.print("Enter the percentage: ");
            double porc = sc.nextDouble();
            
            System.out.println("List of Wmployees: ");
            for(Funcionario funcionario : listFunc){
                if(funcionario.getId() == id){
                    funcionario.setIncrease(porc);
                }
                System.out.println(funcionario.dadosEmployee());
            }
        }   
        
    }
}
