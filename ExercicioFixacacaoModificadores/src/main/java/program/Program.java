/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package program;

import conta.Conta;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author vanio.oliveira
 */
public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);        
        
        System.out.print("Enter account Number: ");
        int nConta = sc.nextInt();
        System.out.print("Enter account holder: ");
        String descarte = sc.nextLine();
        String nome = sc.nextLine();
        Conta conta = new Conta(nome, nConta);
        System.out.print("Is there a initial deposit (y/n):");
        char permissao = sc.nextLine().charAt(0);
        if(permissao == 'y'){
            System.out.print("Enter initial deposit value: ");            
            double deposito = sc.nextDouble();
            conta.deposito(deposito);
        }
        
        System.out.println("Account data:");
        System.out.printf(conta.toString());
        
        System.out.print("Enter a deposit value: ");
        double deposito = sc.nextDouble();
        conta.deposito(deposito);
        System.out.println("Uptaded acconut data: ");
        System.out.print(conta.toString());
        
        System.out.print("Enter a witharaw value: ");
        double saque = sc.nextDouble();
        if(conta.getSaldo() >= (saque+conta.getTaxa())){
            conta.saque(saque);
            System.out.println("uptaded account data:");
        }
        else{
            System.out.println("Withdrawal denied");
        }
        System.out.print(conta.toString());
        
        
        sc.close();
    }
}
